package javaExamples;

public class OctalToDecimal {

	public static void main(String[] args) {

		System.out.println(convertOctalToDecimal(65));
		
		
	}
	
	public static int convertOctalToDecimal(int octal) {
		
		int decimalNumber = 0, i = 0;
		int remainder;
		
		while(octal!=0) {
			
			remainder = octal%10;
			octal = octal/10;
			decimalNumber += remainder*Math.pow(8, i);
			++i;
		
		}
		return decimalNumber;
	}

}
