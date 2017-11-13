package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	String word = "";
	
	public LearnStrings(String s){
		setString(s);
	}	
		
	public void setString(String s) {
		word = s;
		String msg = "String Entered is: " + word;
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public char getFirstLetter() {
		return word.charAt(0); 
	}
	
	public int getLength() {
		return word.length();
	}
		
	public char getLastLetter() {
		return word.charAt(word.length()-1); 
	}
	
	public int beginIndex() {	
		return 0;
	}
	
	public int endIndex() {	
		return 0;
	}
	
	public String getMiddle() {
		return word.substring(1,word.length()-1);
	}		
}