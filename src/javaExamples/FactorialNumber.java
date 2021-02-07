package javaExamples;

public class FactorialNumber {

	public static void main(String[] args) {

		int num = 0;
		getFact2(num);
		FactorialNumber.getFact2(num);
//		int fact = 1;
		
//		for (int i=1; i<=num; i++) {
//			fact = fact * i;
//		}
//		System.out.println("factorial of " + num + " is " + fact);
		
		FactorialNumber deb = new FactorialNumber();
		int factorial = deb.getFact1(0);
		System.out.println("factorial is " + factorial);
	
		}

	
	public int getFact1(int num) {
		
        int fact = 1;
		
		for (int i=1; i<=num; i++) {
			fact = fact * i;
			
		}
		return fact;
	}
	
	public static void getFact2(int num) {
		int fact = 1;
		
		for (int i=1; i<=num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
		
	}

	
	
	
}


