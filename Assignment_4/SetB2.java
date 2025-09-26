package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetB2 {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Vaccination Details - Event Handling");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title label
        JLabel titleLabel = new JLabel("Vaccination Details", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Center Panel
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Name field
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        JTextField nameField = new JTextField(15);
        centerPanel.add(nameField, gbc);

        // 1st Dose checkbox
        JCheckBox dose1 = new JCheckBox("1st Dose");
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(dose1, gbc);

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

        // Output panel
        JPanel outputPanel = new JPanel();
        outputPanel.setBorder(BorderFactory.createTitledBorder("Output"));
        outputPanel.setLayout(new GridLayout(3, 1));

        JLabel outputName = new JLabel("Name: ");
        JLabel outputDose1 = new JLabel("1st Dose: ");
        JLabel outputVaccine = new JLabel("Vaccine: ");

        outputPanel.add(outputName);
        outputPanel.add(outputDose1);
        outputPanel.add(outputVaccine);

        frame.add(outputPanel, BorderLayout.SOUTH);

        // Submit button
        JButton submitBtn = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 4;
        centerPanel.add(submitBtn, gbc);

        // Action Listener
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (name.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter your name.");
                    return;
                }

                String d1 = dose1.isSelected() ? "Yes" : "No";
                String vaccine = "";

                if (rb1.isSelected()) vaccine = "Covishield";
                else if (rb2.isSelected()) vaccine = "Covaxin";
                else if (rb3.isSelected()) vaccine = "Sputnik V";
                else {
                    JOptionPane.showMessageDialog(frame, "Please select a vaccine.");
                    return;
                }

                outputName.setText("Name: " + name);
                outputDose1.setText("1st Dose: " + d1);
                outputVaccine.setText("Vaccine: " + vaccine);
            }
        });

        frame.setVisible(true);
    }
}

