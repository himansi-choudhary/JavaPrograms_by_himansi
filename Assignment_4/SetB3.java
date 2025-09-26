package assignment_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SetB3 extends JFrame implements ActionListener {
    JTextField display;
    JPanel buttonPanel;
    JButton[] buttons;
    JButton clearBtn;

    String[] buttonLabels = {
        "7", "8", "9", "/", 
        "4", "5", "6", "*", 
        "1", "2", "3", "-", 
        ".", "0", "=", "+"
    };

    String currentInput = "";

    public SetB3() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Panel for buttons (4x4 grid)
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        buttons = new JButton[buttonLabels.length];

        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Clear button
        clearBtn = new JButton("Clear");
        clearBtn.setFont(new Font("Arial", Font.BOLD, 16));
        clearBtn.addActionListener(this);
        add(clearBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Clear")) {
            currentInput = "";
            display.setText("");
        } else if (command.equals("=")) {
            try {
                double result = eval(currentInput);
                display.setText(currentInput + " = " + result);
                currentInput = "" + result;
            } catch (Exception ex) {
                display.setText("Error");
                currentInput = "";
            }
        } else {
            currentInput += command;
            display.setText(currentInput);
        }
    }

    // Evaluator that works with +, -, *, /, .
    public double eval(String expression) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (true) {
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                while (true) {
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) {
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(expression.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Unexpected: " + (char) ch);
                }

                return x;
            }
        }.parse();
    }

    public static void main(String[] args) {
        new SetB3();
    }
}

