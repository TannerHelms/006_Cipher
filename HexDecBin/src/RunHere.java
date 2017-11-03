
public class RunHere {
	
	String msg = "";
	/* Grading requirements 
	 * 
	 *  1. all JOP's 
	 *  2. Runnable Jar
	 *  3. Ask For Name, Repeat Name With Hello
	 *  4. Ask What Base are we starting with, Hex, Dec, or Bin
	 *  5. Ask "what base are we converting to 
	 *  6. Enter starting value
	 *  7. Do conversion and display result
	 *  8. Ask if they want to run it again
	 *  
	 *  */
	
	
	public static void main(String[] args) {
		
		BinPower binpower = new BinPower();
		binpower.setBinary();
		
	HexDecBin baseConverter = new HexDecBin();
	
	baseConverter.getHexNumber();
	baseConverter.convert();
	
	
	}
}