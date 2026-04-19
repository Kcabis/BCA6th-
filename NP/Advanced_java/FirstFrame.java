import java.awt.*; 
import javax.swing.*; 
public class FirstFrame extends JFrame {     
    private Button submit;     
    private JButton cancel;     
    public FirstFrame() {         
        setLayout(null);         
        setSize(700, 700);         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        submit = new Button("Submit");     
        cancel = new JButton("Cancel"); 
        submit.setBounds(10, 100, 100, 40);         
        cancel.setBounds(10, 150, 100, 40);         
        add(submit);         
        add(cancel);         
        setVisible(true); 
    } 
    public static void main(String[] args) {         
        new FirstFrame(); 
    } 
} 
