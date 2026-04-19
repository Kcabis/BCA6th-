import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question2 extends JFrame {
  
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;
    private JButton calcButton;

    public Question2() {
        
        setTitle("Addition Program");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10)); 
        setLocationRelativeTo(null); 
        
        num1Field = new JTextField();
        num2Field = new JTextField();
        calcButton = new JButton("Calculate Sum");
        resultLabel = new JLabel("Result: ", SwingConstants.CENTER);

        add(new JLabel("Enter Number 1:"));
        add(num1Field);
        add(new JLabel("Enter Number 2:"));
        add(num2Field);
        add(calcButton);
        add(resultLabel);

       
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1Field.getText());
                    double n2 = Double.parseDouble(num2Field.getText());
                    
                    double sum = n1 + n2;
                    
                    // Display the result
                    resultLabel.setText("Result: " + sum);
                    resultLabel.setForeground(Color.BLUE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Question2().setVisible(true);
        });
    }
}