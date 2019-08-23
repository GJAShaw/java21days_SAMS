/**
 * 
 */
package com.java21days;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author greg.shaw
 *
 */
public class IconFrame extends JFrame {

	
	
	/**
	 * @param title
	 */
	public IconFrame() {
		super("Icon Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		// create icons
		ImageIcon loadIcon = new ImageIcon(getClass().getResource("/images/load.gif"));
		ImageIcon saveIcon = new ImageIcon(getClass().getResource("/images/save.gif"));
		ImageIcon subscribeIcon = new ImageIcon(getClass().getResource("/images/subscribe.gif"));
		ImageIcon unsubscribeIcon = new ImageIcon(getClass().getResource("/images/unsubscribe.gif"));
		//create buttons
		load = new JButton("Load", loadIcon);
		save = new JButton("Save", saveIcon);
		subscribe = new JButton("Subscribe", subscribeIcon);
		unsubscribe = new JButton("Unsubscribe", unsubscribeIcon);
		// add buttons to panel
		panel.add(load);
		panel.add(save);
		panel.add(subscribe);
		panel.add(unsubscribe);
		// add the panel to a frame
		add(panel);
		pack();
		setVisible(true);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton load;
	JButton save;
	JButton subscribe;
	JButton unsubscribe;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IconFrame ike = new IconFrame();
	}

}
