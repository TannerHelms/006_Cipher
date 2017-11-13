package main;

public class Converter {
	String initial = "";
	String convert = "";
	String startValue = "";
	String endValue = "";
	
	Dialog c = new Dialog();
	
	public Converter (String[] a) {
		initial = a[0];
		convert = a[1];
		startValue = a[2];
		
		route();
	}
	
	private void route () {
		if      (initial.equals("hexadecimal") && convert.equals("decimal")) {hexTOdec();}
		else if (initial.equals("hexadecimal") && convert.equals("binary")) {hexTObin();}
		else if (initial.equals("decimal") && convert.equals("hexadecimal")) {decTOhex();}
		else if (initial.equals("decimal") && convert.equals("binary")) {decTObin();}
		else if (initial.equals("binary") && convert.equals("hexadecimal")) {binTOhex();}
		else if (initial.equals("binary") && convert.equals("decimal")) {binTOdec();}
		else {c.text("The arguements you entered are invalid! Either the value format you entered is illegal or you converted to the same type. Please try again.");};
	}
	private void hexTOdec () {
		int num = Integer.parseInt(startValue, 16);
		endValue = Integer.toString(num);
		String answer = "The conversion value is: " + endValue;
		c.text(answer);
	}
	private void hexTObin () {
		int num = Integer.parseInt(startValue, 16);
		endValue = Integer.toBinaryString(num);
		String answer = "The conversion value is: " + endValue;
		c.text(answer);
		
		int binaryLength = endValue.length();
		int byteAmount = Math.floorDiv(binaryLength, 8);
		int nibbleAmount = Math.floorDiv(binaryLength,4);
		c.text("There are " + byteAmount + " byte(s) and " + nibbleAmount + " nibble(s) in this final value.");
		
	}
	private void decTOhex () {
		int num = Integer.parseInt(startValue);
		endValue = Integer.toHexString(num);
		String answer = "The conversion value is: " + endValue;
		c.text(answer);
	}
	private void decTObin () {
		int num = Integer.parseInt(startValue);
		endValue = Integer.toBinaryString(num);
		String answer = "The conversion value is: " + endValue;
		c.text(answer);
		
		int binaryLength = endValue.length();
		int byteAmount = Math.floorDiv(binaryLength, 8);
		int nibbleAmount = Math.floorDiv(binaryLength,4);
		c.text("There are " + byteAmount + " byte(s) and " + nibbleAmount + " nibble(s) in this final value.");
	}
	private void binTOhex () {
		int num = Integer.parseInt(startValue, 2);
		endValue = Integer.toHexString(num);
		String answer = "The conversion value is: " + endValue;
		c.text(answer);
	}
	private void binTOdec () {
		int num = Integer.parseInt(startValue, 2);
		endValue = Integer.toString(num);
		String answer = "The conversion value is: " + endValue;
		c.text(answer);
	}
}
