package com.java21days;

import java.awt.BorderLayout;
import javax.swing.*;

public class FeedBar extends JFrame {

	
	public FeedBar() {
		super("FeedBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		
		// create icons
		ImageIcon loadIcon = new ImageIcon(getClass().getResource("/images/load.gif"));
		ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/save.gif"));
		ImageIcon subscribeIcon = new ImageIcon(getClass().getResource("/images/subscribe.gif"));
		ImageIcon unsubscribeIcon = new ImageIcon(getClass().getResource("/images/unsubscribe.gif"));
		//create buttons
		JButton load = new JButton("Load", loadIcon);
		JButton save = new JButton("Save", saveIcon);
		JButton subscribe = new JButton("Subscribe", subscribeIcon);
		JButton unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		// add buttons to toolbar
		JToolBar bar = new JToolBar();
		bar.add(load);
		bar.add(save);
		bar.add(subscribe);
		bar.add(unsubscribe);
		// prepare user interface
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout border = new BorderLayout();
		setLayout(border);
		add("North", bar);
		add("Center", scroll);
		pack();
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
		FeedBar ike = new FeedBar();
	}

}
