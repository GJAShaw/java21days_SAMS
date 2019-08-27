package com.java21days;

import java.awt.GridLayout;
import javax.swing.*;

public class Slider extends JFrame {

	private static final long serialVersionUID = 1L;

	public Slider() {
		
		super("Slider");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JSlider pick = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
		pick.setMajorTickSpacing(10);
		pick.setMinorTickSpacing(1);
		pick.setPaintTicks(true);
		pick.setPaintLabels(true);
		add(pick);
		pack();
		setVisible(true);
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
		Slider frame = new Slider();

	}

}
