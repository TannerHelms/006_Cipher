package ArrayFun;

import javax.swing.JOptionPane;

public class arrayFun {

	public void showInstructions() {
		
		//next time this will become an array 
		
		String msg = "Essential rules for arrays";
		String msg1 ="1. Arrays have a Fixed length!!! At the time they are created." +
		"At the time they are created.";
		String msg3 ="2. Two ways to set array size:";
		String msg4 ="--one way is to set size from constructed";
		String msg5 ="-- other way is to set size from intail data {n1,n2,..}\\";
		String msg6 ="Dynamic - when program is running:";
		String msg7 ="Can Not NOT NO way to change SIZE of the array";
		String msg8 ="But of course you can change the values!";
		
		msg = (msg + "\n" + msg1 + "\n" + msg3 + "\n" + msg4 + "\n" + msg5 + "\n" + msg6 + "\n" + msg7 + "\n" + msg8); 
		
		
		JOptionPane.showMessageDialog(null, msg);
	}// end of show instructions
	
	public void intArrayExample() {
		
		//why an array? Store tons of info in a single easy var!
		
		//String[] StirngTest = new String(10);
		//First method of creating an array, and than populating it with values
		int[] intTest = new int [14]; //int intTest[] --- this is "math notation"
		intTest[0] = 10;
		intTest[1] = 11;
		intTest[2] = 12;
		intTest[3] = 13;
		intTest[4] = 14;
		intTest[5] = 15;
		intTest[6] = 16;
		intTest[7] = 17;
		intTest[8] = 18;
		intTest[9] = 19;
		intTest[10] = 20;
		intTest[11] = 21;
		intTest[12] = 22;
		intTest[13] = 23;

		
		//second method combines size and data in one step
		int[] intTwoTest = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		
		System.out.println("\nStarting test of intTest[]\n");
		for (int i = 0; i < intTest.length; i++) {
			
			System.out.println("intTest [ " + i + "]: " + intTest[i]);
			
			
		}//end of for loop
	}//end of intArrayExmaple
	
	
}//end of arrayFun
