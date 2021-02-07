package javaExamples;

public class BinaryToDecimal {

	public static void main(String[] args) {

		System.out.println(convertBinaryToDecimal(101));
		
		
	}
	
	
	public static int convertBinaryToDecimal(long num) {
		
		int decimalNumber = 0;
		int i =0;
		long remainder;
		
		while(num!=0) {
			remainder = num%10;
			num = num/10;
			
//			decimalNumber = decimalNumber + (remainder* Math.pow(2, i));
			decimalNumber += (remainder* Math.pow(2, i));
			
			++i;
		}
		
		return decimalNumber;
	}

}
