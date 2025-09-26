package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetA4 extends JFrame implements ActionListener {
    JComboBox<String> comboBox;
    JButton showBtn;
    JLabel resultLabel;

    public SetA4() {
        setTitle("Programming Language Selector");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // -------- Top Label --------
        resultLabel = new JLabel("Programming language Selected: ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(resultLabel, BorderLayout.NORTH);

        // -------- Center Panel (ComboBox + Button) --------
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout());

        String[] languages = {"C", "C++", "C#", "Java", "PHP"};
        comboBox = new JComboBox<>(languages);
        showBtn = new JButton("Show");
        showBtn.addActionListener(this);

        centerPanel.add(comboBox);
        centerPanel.add(showBtn);

        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedLang = (String) comboBox.getSelectedItem();
        resultLabel.setText("Programming language Selected: " + selectedLang);
    }

    public static void main(String[] args) {
        new SetA4();
    }
}
