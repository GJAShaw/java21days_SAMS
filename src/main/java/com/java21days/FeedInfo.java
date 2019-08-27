package com.java21days;

import java.awt.GridLayout;
import javax.swing.*;

public class FeedInfo extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel nameLabel = new JLabel("Name: ", SwingConstants.RIGHT);
	private JTextField name;
	private JLabel urlLabel = new JLabel("URL: ", SwingConstants.RIGHT);
	private JTextField url;
	private JLabel typeLabel = new JLabel("Type: ", SwingConstants.RIGHT);
	private JTextField type;

	public FeedInfo() {
		
		super("Feed information");
		setSize(400, 145);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		// get site name
		String response1 = JOptionPane.showInputDialog(
			null, "Enter the site name:"
		);
		name = new JTextField(response1, 20);
		// get site address
		String response2 = JOptionPane.showInputDialog(
				null, "Enter the site address:"
			);
		url = new JTextField(response2, 20);
		// get site type
		String[] choices = {"Personal", "Commercial", "Unknown"};
		int response3 = JOptionPane.showOptionDialog(
			null,
			"What type of site is it?",
			"Site type",
			0,
			JOptionPane.QUESTION_MESSAGE,
			null,
			choices,
			choices[0]
		);
		type = new JTextField(choices[response3], 20);

		// display choices
		final int ROWS = 3;
		final int COLUMNS = 2;
		setLayout(new GridLayout(ROWS, COLUMNS));
		add(nameLabel);
		add(name);
		add(urlLabel);
		add(url);
		add(typeLabel);
		add(type);
		setLookAndFeel();
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
		FeedInfo frame = new FeedInfo();

	}

}
