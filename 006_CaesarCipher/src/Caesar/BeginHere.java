package Caesar;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		String msg = "";
		String[] options = new String[] {"Yes", "No", "Maybe", "Cancel"};
		String[] opt = new String[] {"Encode", "Decode", "Crack", "Exit"};
		CaesarCipher myCipher = new CaesarCipher();
		Boolean run = false;
		Boolean decode = false;
		Boolean crack = false;
		
		msg = "Do you want to play again?";
		
		 int confirms = JOptionPane.showOptionDialog(null, msg, "Message",
			      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			       null, opt, opt[0]);
		 
				if (confirms == JOptionPane.YES_OPTION) {
				
					run = true;
				}
				
				else if (confirms == JOptionPane.NO_OPTION) {
					
					decode = true;
					
				}
				
				else if (confirms == JOptionPane.CANCEL_OPTION) {
					crack = true;
				}
				
				else { 
					JOptionPane.showMessageDialog(null, "Good Bye!");
				}
		
		
		
		
		while (run) {
		
			String plainText =	JOptionPane.showInputDialog(null,"Please enter plain text to endcode:");

			int key = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the key"));
		
		
		JOptionPane.showMessageDialog(null,"Your key is: " + key);
		
		
	 String codedText = myCipher.encode(plainText, key);
	 JOptionPane.showMessageDialog(null,"Your secret message is: " + codedText);
		
		
		
		
		
		msg = "Do you want to play again?";
		
		 int confirm = JOptionPane.showOptionDialog(null, msg, "Message",
			      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			       null, options, options[0]);
		 
				if (confirm == JOptionPane.YES_OPTION) {
					run = true;
				}
				
				else if (confirm == JOptionPane.NO_OPTION) {
					
				JOptionPane.showMessageDialog(null, "Have a Nice Day!");
					run = false;
				}
				
				else if (confirm == JOptionPane.CANCEL_OPTION) {
	
					int maybe = JOptionPane.showConfirmDialog(null, "So indecisive. Try agian.");
						
					
						if (maybe == JOptionPane.YES_OPTION) {
							run = true;
						}
						
						else if (maybe == JOptionPane.NO_OPTION) {
							run = false;
						}
						else {
							run = false;
						}
			
				}
				
				else {
					run = false;
				}
		
		
		
	}// end of while loop run
		
		while (decode) {
			
			String plainText =	JOptionPane.showInputDialog(null,"Please enter plain text to decode:");

			int key = Integer.parseInt(JOptionPane.showInputDialog(null,"please enter the key"));
		
		
		JOptionPane.showMessageDialog(null,"Your key is: " + key);
		
		
	 String codedText = myCipher.decode(plainText, key);
	 JOptionPane.showMessageDialog(null,"Your secret message is: " + codedText);
		
		
		
		
		
		msg = "Do you want to play again?";
		
		 int confirm = JOptionPane.showOptionDialog(null, msg, "Message",
			      JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
			       null, options, options[0]);
		 
				if (confirm == JOptionPane.YES_OPTION) {
					decode = true;
				}
				
				else if (confirm == JOptionPane.NO_OPTION) {
					
				JOptionPane.showMessageDialog(null, "Have a Nice Day!");
					decode = false;
				}
				
				else if (confirm == JOptionPane.CANCEL_OPTION) {
	
					int maybe = JOptionPane.showConfirmDialog(null, "So indecisive. Try agian.");
						
					
						if (maybe == JOptionPane.YES_OPTION) {
							decode = true;
						}
						
						else if (maybe == JOptionPane.NO_OPTION) {
							decode = false;
						}
						else {
							decode = false;
						}
			
				}
				
				else {
					decode = false;
				}
		
		
		}// end of decode
		
		while (crack) {
			
			String secretText =	JOptionPane.showInputDialog(null,"Please enter the secret text to crack.");
			int keys = 0;

			
			
		
		
	 String plainText = myCipher.cracker(secretText, keys);
	 JOptionPane.showMessageDialog(null,"Your secret messages are in the console.");
	 
			
		}// end of crack
		
		
	}
	}
		
		
	

