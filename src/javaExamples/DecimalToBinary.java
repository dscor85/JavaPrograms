package javaExamples;

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.println("final: " + convertDecimalToBinary(9));
		
	}
	
	public static long convertDecimalToBinary(int n) {
		long binaryNumber = 0;
		int remainder = 1, i = 1;
		
		while(n!=0) {
			remainder = n%2;
			n = n/2;
//			binaryNumber += remainder*i;
			binaryNumber = binaryNumber + remainder*i;
			
			i*=10;	
		
			
		}
		return binaryNumber;
	}
	
	

}
