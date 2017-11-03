import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {
	 
	Scanner kbd = new Scanner(System.in);
	String name = "";
    String hex = "";
	String msg = "";
	int num;
	 
	public HexDecBin() {
		System.out.println("welcome to my Hexadecimal, Decimal or " 
	+ "Binary conversion program.");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name + " let's begin:");
		
	}
	
	void getHexNumber() {
		
		msg = "Enter the hex number :";
		JOptionPane.showInputDialog(null, msg);
		hex = kbd.nextLine();
		// mouse over parseInt to read pop-up guide
		num= Integer.parseInt(hex,16);
		System.out.println("You have entered hex " + hex);
		System.out.println("Decimal value is: " + num + "(remember 0-" + num + " has " + (num+1) + " values)");
	}
	
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whloe nibbles (4 bits) with x and y bits remaining" );
		System.out.println("Number of whloe bytes (8 bits) with x and y bits remaining" );
		
	}
	
}
