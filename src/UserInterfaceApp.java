/*
----------------------------------------------
Program Name: User Interface App
Author: Cody Walker
Date: 05/01/2026
----------------------------------------------
Pseudocode:
1. Create main class
2. Create main method
3. Print placeholder message
----------------------------------------------
Program Inputs: None
Program Outputs: Placeholder message
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

        // Make window visible
        frame.setVisible(true);
    }
}