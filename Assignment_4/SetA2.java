package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetA2 {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Vaccination Details");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title label at the top-center
        JLabel titleLabel = new JLabel("Vaccination Details", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Center panel for input fields
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Name Label and TextField
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(15);
        centerPanel.add(nameField, gbc);

        // Dose checkboxes
        JCheckBox dose1 = new JCheckBox("1st Dose");
        JCheckBox dose2 = new JCheckBox("2nd Dose");

        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(dose1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(dose2, gbc);

        // Vaccine radio buttons
        JRadioButton rb1 = new JRadioButton("Covishield");
        JRadioButton rb2 = new JRadioButton("Covaxin");
        JRadioButton rb3 = new JRadioButton("Sputnik V");

        ButtonGroup vaccineGroup = new ButtonGroup();
        vaccineGroup.add(rb1);
        vaccineGroup.add(rb2);
        vaccineGroup.add(rb3);

        gbc.gridx = 1;
        gbc.gridy = 1;
        centerPanel.add(rb1, gbc);

        gbc.gridy = 2;
        centerPanel.add(rb2, gbc);

        gbc.gridy = 3;
        centerPanel.add(rb3, gbc);

        frame.add(centerPanel, BorderLayout.CENTER);

        // Bottom panel to display info
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBorder(BorderFactory.createTitledBorder("Output"));
        bottomPanel.setLayout(new GridLayout(4, 1));

        JLabel outputName = new JLabel("Name: ");
        JLabel outputDose1 = new JLabel("1st Dose: ");
        JLabel outputDose2 = new JLabel("2nd Dose: ");
        JLabel outputVaccine = new JLabel("Vaccine: ");

        bottomPanel.add(outputName);
        bottomPanel.add(outputDose1);
        bottomPanel.add(outputDose2);
        bottomPanel.add(outputVaccine);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 4;
        centerPanel.add(submitBtn, gbc);

        // Event handling for submit button
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String d1 = dose1.isSelected() ? "Yes" : "No";
                String d2 = dose2.isSelected() ? "Yes" : "No";
                String vaccine = "";

                if (rb1.isSelected()) vaccine = "Covishield";
                else if (rb2.isSelected()) vaccine = "Covaxin";
                else if (rb3.isSelected()) vaccine = "Sputnik V";

                outputName.setText("Name: " + name);
                outputDose1.setText("1st Dose: " + d1);
                outputDose2.setText("2nd Dose: " + d2);
                outputVaccine.setText("Vaccine: " + vaccine);
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}
