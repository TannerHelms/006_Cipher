package main;

import javax.swing.JOptionPane;

public class Dialog {
	
	private String[] tempArray = {"","",""};
	private Object[] optionArray = {"hexadecimal", "decimal", "binary"};
	private String name;
	
	public String[] startup () {
		
		text("Welcome to my Hexadecimal, Decimal, and Binary conversion app!");
		name = (String) input("What is your name?");
		text("Hello, " + name + ". Let's begin");
		tempArray[0] = (String) choice("Is the value you would like to convert in hexadecimal, decimal, or binary form?", optionArray);
		tempArray[1] = (String) choice("What do you want to convert the value into?", conversionLimiter());
		tempArray[2] = input("What is the value you want to convert?");
		
		return tempArray;
	}
	
	private Object[] conversionLimiter() {
		String choice = tempArray[0];
		
		Object[] hex = {"decimal","binary"};
		Object[] dec = {"hexadecimal","binary"};
		Object[] bin = {"hexadecimal","decimal"};
		
		if (choice.equals("hexadecimal")) {
			return hex;
		}
		else if (choice.equals("decimal")) {
			return dec;
		}
		else if (choice.equals("binary")) {
			return bin;
		}
		return null;
	}
	
	public void text (String message) {
		JOptionPane.showMessageDialog(null, message); 
	}
	
	public String input (String message) {
		return JOptionPane.showInputDialog(null, message);
	}
	
	public Object choice (String message, Object[] options) {
		
		return JOptionPane.showInputDialog(null, message, "Input",
		JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
}
