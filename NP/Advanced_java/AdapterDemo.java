import java.awt.*;
import java.awt.event.*;

// We extend WindowAdapter instead of implementing WindowListener
class MyWindowHandler extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing... Goodbye!");
        System.exit(0);
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Adapter Demo");

        // We attach our adapter to the frame
        frame.addWindowListener(new MyWindowHandler());

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}