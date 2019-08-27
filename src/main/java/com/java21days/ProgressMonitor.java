package com.java21days;

import java.awt.*;
import javax.swing.*;

public class ProgressMonitor extends JFrame {

	JProgressBar current;
	JTextArea out;
	JButton find;
	int num = MIN;
	private static final long serialVersionUID = 1L;
	private static final int MAX = 2000;
	private static final int MIN = 0;
	
	public ProgressMonitor() {
		super("Progress Monitor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(205, 68);
		setLayout(new FlowLayout());
		current = new JProgressBar(MIN, MAX);
		current.setValue(MIN);
		current.setStringPainted(true);
		add(current);
	}
	
	public void iterate() {
		while (num < MAX) {
			current.setValue(num);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// do nowt
			}
			num += 95;
		}
	}


	private void setLookAndFeel() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception exc) {
			System.err.println("Couldn't use the system look and feel: " + exc);
		}

	}
	
	public static void main(String[] args) {
		ProgressMonitor frame = new ProgressMonitor();
		frame.setVisible(true);
		frame.iterate();
	}

}
