// Q.Program to demonstrate Button and text field.
package assignment_4;


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Ex9_JButtonDemo extends JFrame implements ActionListener{
	JTextField jtf;
	JButton jb;
	public Ex9_JButtonDemo() { 
		setLayout(new FlowLayout());
	    jtf = new JTextField(15);
	    add (jtf);
	    jb = new JButton("Click Me");
	    jb.addActionListener (this);
	    add(jb);
	    setSize(200,200);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	    jtf.setText (ae.getActionCommand());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex9_JButtonDemo();
	}

}
