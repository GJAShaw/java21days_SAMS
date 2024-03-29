package com.java21days;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class Alphabet extends JFrame {

	
	public Alphabet() {
		super("Alphabet");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setSize(360, 120);
		FlowLayout lm = new FlowLayout(FlowLayout.TRAILING);
		setLayout(lm);
		//create buttons
		JButton a = new JButton("Alibi");
		JButton b = new JButton("Burglar");
		JButton c = new JButton("Corpse");
		JButton d = new JButton("Deadbeat");
		JButton e = new JButton("Evidence");
		JButton f = new JButton("Fugitive");
		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);
		setVisible(true);
	}

	private static final long serialVersionUID = 1L;

	private void setLookAndFeel() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception exc) {
			System.err.println("Couldn't use the system look and feel: " + exc);
		}

	}
	
	public static void main(String[] args) {
		Alphabet frame = new Alphabet();
	}

}
