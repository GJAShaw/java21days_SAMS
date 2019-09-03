/**
 * 
 */
package com.java21days;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * @author greg.shaw
 *
 */
public class ButtonFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton load = new JButton("Load");
	JButton save = new JButton("Save");
	JButton unsubscribe = new JButton("Unsubscribe");
	
	public ButtonFrame() {
		super("Button Frame");
		setSize(340, 170);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		JPanel pane = new JPanel();
		pane.add(load);
		pane.add(save);
		pane.add(unsubscribe);
		add(pane);
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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ButtonFrame bf = new ButtonFrame();
		bf.unsubscribe.setEnabled(false);

	}

}
