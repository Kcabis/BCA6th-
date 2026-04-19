import javax.swing.*;

public class MenuExample extends JFrame {

    public MenuExample() {
        setTitle("Menu Item Implementation");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // 1. Create the Menu Bar (The horizontal bar at the top)
        JMenuBar mb = new JMenuBar();

        // 2. Create Menus (The categories)
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // 3. Create Menu Items (The clickable actions)
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        // 4. Add Items to the "File" Menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a horizontal line
        fileMenu.add(exitItem);

        // 5. Add Menus to the Menu Bar
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(helpMenu);

        // 6. Set the Menu Bar to the Frame
        setJMenuBar(mb);

        // 7. Add Functionality (Action Listeners)
        exitItem.addActionListener(e -> System.exit(0));

        saveItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Save clicked!");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        //new MenuExample();
    }
}