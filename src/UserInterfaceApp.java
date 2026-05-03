/*
----------------------------------------------
Program Name: User Interface App
Author: Cody Walker
Date: 05/01/2026
----------------------------------------------
Pseudocode:
1. Create main window
2. Add menu with 4 options
3. Add text area for output
4. Display date/time when menu item is clicked
----------------------------------------------
Program Inputs: Menu selections
Program Outputs: Text displayed in text area
----------------------------------------------
*/

import javax.swing.*;
import java.awt.*;

public class UserInterfaceApp {

    public static void main(String[] args) {

        // Create main window
        JFrame frame = new JFrame("User Interface App");

        // Set size of window
        frame.setSize(600, 400);

        // Close program when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        frame.setLayout(new BorderLayout());

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menu
        JMenu menu = new JMenu("Options");

        // Create menu items
        JMenuItem item1 = new JMenuItem("Show Date/Time");
        JMenuItem item2 = new JMenuItem("Save to File");
        JMenuItem item3 = new JMenuItem("Change Background Color");
        JMenuItem item4 = new JMenuItem("Exit");

        // Add items to menu
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);

        // Add menu to menu bar
        menuBar.add(menu);

        // Add menu bar to frame
        frame.setJMenuBar(menuBar);

        // Create text area
        JTextArea textArea = new JTextArea();

        // Make it scrollable
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add to center of layout
        frame.add(scrollPane, BorderLayout.CENTER);

        // Action: Show Date/Time
        item1.addActionListener(e -> {
            String dateTime = java.time.LocalDateTime.now().toString();
            textArea.append("Date/Time: " + dateTime + "\n");
        });

        // Make window visible
        frame.setVisible(true);
    }
}