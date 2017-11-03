import java.util.Scanner;

import javax.swing.JOptionPane;

public class BinPower {
	
	Scanner input = new Scanner(System.in);
	String name = "";
	String msg = "";

	public BinPower() {
		
		
	} 
	
	public void setBinary() {
		
		double base;
		double exp;
		int ans = 0;
		
		msg = "Hello Java Student! What is your name? ";
		JOptionPane.showMessageDialog(null, msg);
		name = input.nextLine();
		msg = "Thanks for using my progam " + name + ".";
		JOptionPane.showMessageDialog(null, msg);
		msg = "Which exponent do you want " + name + "?";
		JOptionPane.showMessageDialog(null, msg);
		exp = input.nextDouble();
		msg = name + " you have entered " + exp + " as your exponent.";
		JOptionPane.showMessageDialog(null, msg);
		ans = (int) Math.pow(2, exp);

		
		msg = "Answer is: " + ans;
		JOptionPane.showMessageDialog(null, msg);
	}
	
	
	
}

		