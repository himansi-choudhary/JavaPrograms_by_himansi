package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetA1 extends JFrame implements ActionListener {
    // Components
    JLabel lblUsername, lblPassword, lblHeading;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JButton btnLogin, btnReset;

    public SetA1() {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        lblHeading = new JLabel("Login", JLabel.CENTER);
        lblHeading.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblHeading, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        lblUsername = new JLabel("Username:");
        txtUsername = new JTextField();
        lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField();

        inputPanel.add(lblUsername);
        inputPanel.add(txtUsername);
        inputPanel.add(lblPassword);
        inputPanel.add(txtPassword);

        add(inputPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        btnLogin = new JButton("Login");
        btnReset = new JButton("Reset");

        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);

        buttonPanel.add(btnLogin);
        buttonPanel.add(btnReset);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String username = txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            JOptionPane.showMessageDialog(this, "Login clicked!\nUsername: " + username + "\nPassword: " + password);
        } else if (e.getSource() == btnReset) {
            txtUsername.setText("");
            txtPassword.setText("");
        }
    }

    public static void main(String[] args) {
        new SetA1();
    }
}
