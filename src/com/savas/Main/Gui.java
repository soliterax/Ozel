package com.savas.Main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {
	static JFrame frame = new JFrame();
	static JButton button1 = new JButton();
	
	public static void Main(String[]args) {
		button1.setSize(50, 20);
		button1.setLocation(50, 50);
		button1.setText("Oyna");
		frame.add(button1);
		frame.setVisible(true);
	}
}
