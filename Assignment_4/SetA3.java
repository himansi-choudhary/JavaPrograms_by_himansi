package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetA3 extends JFrame implements ActionListener {
    JLabel wordLabel, charLabel;
    JTextArea textArea;
    JButton countBtn;

    public SetA3() {
        setTitle("Count words and characters");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Labels
        wordLabel = new JLabel("Words: 0");
        charLabel = new JLabel("Characters: 0");

        // Text area with scrollbars
        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // Button
        countBtn = new JButton("Count Words");
        countBtn.addActionListener(this);

        // Add components
        add(wordLabel);
        add(charLabel);
        add(scrollPane);
        add(countBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText().trim();

        // Count characters
        int charCount = text.length();

        // Count words (split by whitespace, remove extra spaces)
        int wordCount = 0;
        if (!text.isEmpty()) {
            String[] words = text.split("\\s+");
            wordCount = words.length;
        }

        // Update labels
        wordLabel.setText("Words: " + wordCount);
        charLabel.setText("Characters: " + charCount);
    }

    public static void main(String[] args) {
        new SetA3();
    }
}