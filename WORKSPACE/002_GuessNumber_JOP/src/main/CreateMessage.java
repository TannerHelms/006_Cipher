package main;

import javax.swing.JOptionPane;

public class CreateMessage {

	public CreateMessage () {

	}
	
	public void msg (String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public int msgIN (String message) {
		return Integer.parseInt((String) JOptionPane.showInputDialog(message));
	}
}

