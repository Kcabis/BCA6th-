import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapeGallery extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Cast Graphics to Graphics2D for better control
        Graphics2D g2d = (Graphics2D) g;

        // Enable Anti-aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Draw a Solid Blue Rectangle
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 100, 60);

        // 2. Draw a Red Outline Circle with a thick stroke
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawOval(200, 50, 80, 80);

        // 3. Draw a Green Rounded Rectangle
        g2d.setColor(Color.GREEN);
        g2d.fillRoundRect(350, 50, 120, 70, 25, 25);

        // 4. Draw an Orange Polygon (Triangle)
        g2d.setColor(Color.ORANGE);
        int[] xPoints = {50, 100, 150};
        int[] yPoints = {250, 150, 250};
        g2d.fillPolygon(xPoints, yPoints, 3);

        // 5. Draw a Pink Ellipse using Shape objects
        g2d.setColor(Color.MAGENTA);
        Ellipse2D ellipse = new Ellipse2D.Double(200, 180, 120, 60);
        g2d.fill(ellipse);

        // 6. Draw a custom Line
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.drawLine(350, 200, 470, 230);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java 2D Shape Gallery");
        ShapeGallery panel = new ShapeGallery();

        frame.add(panel);
        frame.setSize(550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setVisible(true);
    }
}