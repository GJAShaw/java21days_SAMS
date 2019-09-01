package com.java21days;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class Stacker extends JFrame {

	
	public Stacker() {
		super("Stacker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		// create top panel
		JPanel commandPane = new JPanel();
		BoxLayout horizontal = new BoxLayout(commandPane, BoxLayout.X_AXIS);
		commandPane.setLayout(horizontal);

		ImageIcon refreshIcon = new ImageIcon(getClass().getResource("/images/Refresh24.gif"));
		ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/save.gif"));
		ImageIcon subscribeIcon = new ImageIcon(getClass().getResource("/images/subscribe.gif"));
		ImageIcon unsubscribeIcon = new ImageIcon(getClass().getResource("/images/unsubscribe.gif"));

		JButton refresh = new JButton("Refresh", refreshIcon);
		JButton save = new JButton("Save", saveIcon);
		JButton subscribe = new JButton("Subscribe", subscribeIcon);
		JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);

		commandPane.add(subscribe);
		commandPane.add(unsubscribe);
		commandPane.add(refresh);
		commandPane.add(save);
		
		// create bottom panel
		JPanel textPanel = new JPanel();
		JTextArea text = new JTextArea(4, 70);
		JScrollPane scrollPane = new JScrollPane(text);

		// put them together
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(commandPane);
		add(scrollPane);
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
		Stacker st = new Stacker();
	}

}
