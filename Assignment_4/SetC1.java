// File: SetC1.java
// Package: assignment_4

package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetC1 extends JFrame {

    JTextArea textArea;

    public SetC1() {
        // Title
        super("Notepad");

        // Create Text Area
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create Menu Bar
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");

        // Edit Menu
        JMenu editMenu = new JMenu("Edit");

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem selectAllItem = new JMenuItem("Select All");

        // Add action listeners for Edit Menu
        cutItem.addActionListener(e -> textArea.cut());
        copyItem.addActionListener(e -> textArea.copy());
        pasteItem.addActionListener(e -> textArea.paste());
        selectAllItem.addActionListener(e -> textArea.selectAll());

        // Add items to Edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(selectAllItem);

        // Help Menu
        JMenu helpMenu = new JMenu("Help");

        // Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set MenuBar
        setJMenuBar(menuBar);

        // Add Text Area
        add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SetC1();
    }
}
