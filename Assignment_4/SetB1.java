package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetB1 extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, resetButton;
    private int attemptCount = 0;
    private final String validUsername = "admin";
    private final String validPassword = "12345";

    public SetB1() {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center on screen

        // Layout setup
        setLayout(new GridLayout(4, 2, 10, 10));
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");

        // Add action listeners
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Add components to frame
        add(userLabel);
        add(usernameField);
        add(passLabel);
        add(passwordField);
        add(loginButton);
        add(resetButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Reset button logic
        if (e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
            return;
        }

        // Login button logic
        String enteredUsername = usernameField.getText();
        String enteredPassword = new String(passwordField.getPassword());

        if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
            JOptionPane.showMessageDialog(this, "Login Successful");
            attemptCount = 0; // reset attempt count on success
        } else {
            attemptCount++;
            if (attemptCount >= 3) {
                JOptionPane.showMessageDialog(this, "Login Failed. 3 incorrect attempts.");
                loginButton.setEnabled(false); // disable login button
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password is incorrect. Attempt " + attemptCount + " of 3");
            }
        }
    }

    public static void main(String[] args) {
        new SetB1();
    }
}
