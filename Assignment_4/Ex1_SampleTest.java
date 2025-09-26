package assignment_4;

import javax.swing.*;
public class Ex1_SampleTest extends JFrame {
	JFrame f;
    Ex1_SampleTest() {
    	JButton b=new JButton("click");
        b.setBounds(130,100,100, 40);
        add(b);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
    	new Ex1_SampleTest();
    }
} 
