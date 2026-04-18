import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentTableApp extends JFrame {
    JTable table;
    DefaultTableModel model;

    public StudentTableApp() {
        setTitle("Student Records");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 1. Create Table Model with Column Names
        String[] columns = {"ID", "Name", "Major"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);

        // 2. Add table to a ScrollPane (so we can see headers)
        add(new JScrollPane(table), BorderLayout.CENTER);

        // 3. Fetch Data
        fetchStudentData();
    }

    private void fetchStudentData() {
        // Change these to match your DB settings
        // Updated connection details
        String url = "jdbc:mysql://localhost:3306/school_db"; // Use the DB name you created
        String user = "root"; // XAMPP default is root
        String password = ""; // XAMPP default is empty (blank)
        String query = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String major = rs.getString("major");

                // Add row to the JTable model
                model.addRow(new Object[]{id, name, major});
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        // Run UI on the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> {
            new StudentTableApp().setVisible(true);
        });
    }
}