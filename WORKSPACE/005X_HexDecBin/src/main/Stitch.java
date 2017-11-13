package main;

import java.util.Arrays;

public class Stitch {

	public static void main(String[] args) {
		
		boolean runAgain = true;
		/*
		 * Grading Requirements:
		 * 
		 * 1. All JOP's, no Scanner/Console Output
		 * 2. Runnable jar -- standalone outside of Eclipse
		 * 3. Ask for name, repeat name with a friendly hello
		 * 4. Ask for initial conversion type and convert type
		 * 5. Enter the value that you want converted
		 * 6. Display result of conversion
		 * 7. Ask if user would like to go again, if not, friendly end the program 
		 */
		
		Dialog d = new Dialog();
		
		while (runAgain) {
			String runArgs;
			String argsArray[] = d.startup();
			Converter c = new Converter(argsArray);
			
			boolean properArgs = true;
			while (properArgs) {
				runArgs = d.input("Would you like to convert another value?");
				runArgs = runArgs.toLowerCase();
				if (runArgs.equals("yes")) {
					runAgain = true;
					properArgs = false;
				} 
				else if (runArgs.equals("y")) {
					runAgain = true;
					properArgs = false;
				}
				else if (runArgs.equals("no")) {
					runAgain = false;
					properArgs = false;
				}
				else if (runArgs.equals("n")) {
					runAgain = false;
					properArgs = false;
				}
				else {
					runAgain = false;
					d.text("You didn't give a valid answer, try again.");
				}
			}
			
		}
		d.text("Thanks for using my program! Goodbye.");
	}
}
