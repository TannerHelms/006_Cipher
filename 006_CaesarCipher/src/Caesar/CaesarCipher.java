package Caesar;

public class CaesarCipher {

	private String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.:'";
	
	public String encode(String plainText, int key) {
		
		String secretText = "";
		int index, keyAdded;

		for (int i = 0; i < plainText.length(); i++) {
			if (plainText.charAt(i) != ' ') {
				index = alpha.indexOf(plainText.charAt(i));
				keyAdded = (index + key) % alpha.length();
				secretText = secretText + alpha.charAt(keyAdded);
			} else {
				secretText = secretText + " ";
			}

		}


		return secretText;

	}
	
	public String decode(String plainText, int key) {
		
		String secretText = "";			// Still need to work on have to reverse
		return secretText;
	}
	
	public String cracker(String secretText, int keys) {
		
	String plainText = "";				// in progress make keys display PlainText in console
		

		for (int i = 0; i <= secretText.length(); i++) {
			
			keys = keys + 1;
			int index, keyAdded;
			
			
			
			
			
			if (secretText.charAt(i) != ' ') {
				index = alpha.indexOf(secretText.charAt(i));
				keyAdded = (index + keys) % alpha.length();
				plainText = plainText + alpha.charAt(keyAdded);
			} else {
				plainText = plainText + " ";
			}
			
			
			System.out.println(plainText);
			
			
		}


		return plainText;
	}
	

}