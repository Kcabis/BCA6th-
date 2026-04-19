import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

// 1. Class to store User data
class User {
    String username;
    String email;

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Username: " + username + " | Email: " + email;
    }
}

public class LoginForm extends JFrame {
    // List to store multiple users
    private ArrayList<User> userDatabase = new ArrayList<>();

    // GUI Components
    private JTextField userField, emailField;
    private JTextArea displayArea;

    public LoginForm() {
        setTitle("Student Login Portal");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Username Input
        add(new JLabel("Username:"));
        userField = new JTextField(20);
        add(userField);

        // Email Input
        add(new JLabel("Email:   "));
        emailField = new JTextField(20);
        add(emailField);

        // Buttons
        JButton saveBtn = new JButton("Save User");
        JButton showBtn = new JButton("Display All");
        add(saveBtn);
        add(showBtn);

        // Display Area
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        // 2. Logic to Save Data
        saveBtn.addActionListener(e -> {
            String name = userField.getText();
            String email = emailField.getText();

            if (!name.isEmpty() && !email.isEmpty()) {
                userDatabase.add(new User(name, email));
                JOptionPane.showMessageDialog(this, "Data Stored Successfully!");
                userField.setText("");
                emailField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // 3. Logic to Display Data
        showBtn.addActionListener(e -> {
            displayArea.setText("--- Stored User Info ---\n");
            for (User u : userDatabase) {
                displayArea.append(u.toString() + "\n");
            }
        });
    }

    public static void main(String[] args) {
        // Run the GUI
        SwingUtilities.invokeLater(() -> new LoginForm().setVisible(true));
    }
}