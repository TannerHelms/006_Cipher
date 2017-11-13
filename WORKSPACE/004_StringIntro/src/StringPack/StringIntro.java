package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {
		
		String msg = "";
		String varWord = "";
		boolean run = true;
		
		while (run) {
			msg = "What is your name?";
			varWord = JOptionPane.showInputDialog(msg);
				
			LearnStrings getIt = new LearnStrings(varWord);
			
			msg ="First char is: " + getIt.getFirstLetter();
			JOptionPane.showMessageDialog(null, msg);
			msg ="Length = " + getIt.getLength();
			JOptionPane.showMessageDialog(null, msg);
			msg ="Last char is: " + getIt.getLastLetter();
			JOptionPane.showMessageDialog(null, msg);
			msg = "Middle is: " + getIt.getMiddle();
			JOptionPane.showMessageDialog(null, msg);
			msg = "Do you want to play again?";
				
			int confirm = JOptionPane.showConfirmDialog(null, msg);
			if (confirm == JOptionPane.YES_OPTION){
				run = true;
			}
			else if (confirm == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Okay. Goodbye!");
				run = false;
			}
		}
	}
}