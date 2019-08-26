/**
 * 
 */
package com.java21days;

import java.awt.HeadlessException;

import javax.swing.*;

/**
 * @author greg
 *
 */
public class Authenticator extends JFrame {
	
	public static final int TEXT_LINES = 4; 
	public static final int TEXT_WIDTH = 15; 

	private static final long serialVersionUID = 1L;
	JTextField username = new JTextField(TEXT_WIDTH);
	JPasswordField password = new JPasswordField(TEXT_WIDTH);
	JTextArea comments = new JTextArea(TEXT_LINES, TEXT_WIDTH);
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancel");
	
	
	public Authenticator() {
		super("account information");
		setSize(300, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		JLabel usernameLabel = new JLabel("Username: ");
		JLabel passwordLabel = new JLabel("Password: ");
		JLabel commentsLabel = new JLabel("Comments: ");

		comments.setLineWrap(true);
		comments.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(
			comments,
			ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
		);
		
		pane.add(usernameLabel);
		pane.add(username);
		pane.add(passwordLabel);
		pane.add(password);
		pane.add(commentsLabel);
		pane.add(scroll);
		pane.add(ok);
		pane.add(cancel);
		add(pane);
		setVisible(true);

	}

	private static void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Authenticator.setLookAndFeel();
		Authenticator auth = new Authenticator();
	}

}
