package javaExamples;

public class NumberExpressedAsTwoPrimes {

	public static void main(String[] args) {
		
		
		int num = 34;
		boolean flag = false;
		
		for (int i = 2; i<=num/2; i++) {
			
			
			if (checkPrimeNumber(i)) {
				
				if (checkPrimeNumber(num-i)) {
					
					System.out.println(num + " = " + i + " + " + (num - i));
					flag = true;
				}
			}
			
		}
		if (!flag) {
			System.out.println(num + "cannot be expressed as as sum of prime numbers");
		}
		 		
	}
	
	
	public static boolean checkPrimeNumber(int number){
		
		
		boolean isPrime = true;
		for (int i=2; i<=number/2; i ++) {
			if (number%i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		return isPrime;
	}
	

}
