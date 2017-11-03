
public class Runner {

	public static void main(String[] args) {
	
	int numberBits = 10;
	int bite = 8;
	int nibble = 4;
	int byteAnswer = 0, byteRemainder = 0;
	
	byteRemainder = numberBits % 0;
	byteAnswer = numberBits / 8;
		
	
	
	System.out.println("bits = " + numberBits + " bytes = " + byteAnswer + " remaider = " + byteRemainder );
	
	}
}
