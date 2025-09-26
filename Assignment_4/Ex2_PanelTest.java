package assignment_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex2_PanelTest extends JFrame {
	 private JButton b, b1, b2;
	 private JLabel l;

	 public Ex2_PanelTest(){
		 l = new JLabel("panel label");
	     b = new JButton("button1");
	     b1 = new JButton("button2");
	     b2 = new JButton("button3");
	     JPanel p = new JPanel();
	     p.add(b);
	     p.add(b1);
	     p.add(b2);
	     p.add(l);
	     p.setBackground(Color.red);
	     add(p);
	     setSize(300, 300);
	     
	     show();
	 }

	public static void main(String[] args) {
		Ex2_PanelTest p = new Ex2_PanelTest();

	}

}
