package javaExamples;

public class DecimalToOctal {

	public static void main(String[] args) {

		System.out.println(convertDecimalToOctal(65));
		
	}
	
	public static int convertDecimalToOctal(int decimal) {
		
		int octalNumber = 0, i =1;
		int remainder; 
		
		while(decimal!=0) {
			
			remainder = decimal%8;
			decimal = decimal/8;
			octalNumber += remainder*i;
			i*=10;
			
		}
		return octalNumber;
	}

}
