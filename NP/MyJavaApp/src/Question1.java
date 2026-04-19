import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Question1 extends JFrame {
    JTable table;
    DefaultTableModel model;
    String url = "jdbc:mysql://localhost:3306/school_db";
    String user = "root";
    String password = "";

    public Question1() {
        setTitle("Book Records System");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columns = {"ID", "Title", "Author"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);

        add(new JScrollPane(table), BorderLayout.CENTER);

        initializeData();
    }

    private void initializeData() {
        try {
            insertSampleBook("Harry poter and the Soccers stone", "J.K. Rowling");
            refreshData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Operation Failed: " + e.getMessage());
        }
    }

    private void insertSampleBook(String title, String author) throws SQLException {
        String sql = "INSERT INTO books (title, author) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.executeUpdate();
        }
    }

    private void refreshData() throws SQLException {
        String query = "SELECT * FROM books";
        model.setRowCount(0);
        
        System.out.println("--- Retrieving Records to Console ---");

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");

                System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author);
                model.addRow(new Object[]{id, title, author});
            }
        }
        System.out.println("--- End of Records ---\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Question1().setVisible(true);
        });
    }
}