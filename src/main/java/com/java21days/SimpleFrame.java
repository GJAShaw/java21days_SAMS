/**
 * 
 */
package com.java21days;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * @author greg.shaw
 *
 */
public class SimpleFrame extends JFrame {

	
	public SimpleFrame() {
		super("Frame Title");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		setVisible(true);
	}

	private static void setLookAndFeel() {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// do nothing
		}

	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleFrame sf = new SimpleFrame();

	}

}
