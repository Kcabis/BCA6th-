import java.sql.*;

public class JDBCConnect {
    public static void main(String[] args) {
        // 1. Connection details
        // 'school_db' is the database you created in phpMyAdmin
        String url = "jdbc:mysql://localhost:3306/school_db";
        String user = "root";
        String password = ""; // Default XAMPP password is empty

        System.out.println("Connecting to database...");

        // 2. Establish connection using Try-with-resources (auto-closes connection)
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            
            if (connection != null) {
                System.out.println("Successfully connected to MySQL via XAMPP!");
            }

        } catch (SQLException e) {
            System.out.println("Connection failed!");
            
        }
    }
}