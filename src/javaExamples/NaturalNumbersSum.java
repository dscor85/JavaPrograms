package javaExamples;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		
		int num = 3;
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
			
		}
		
		System.out.println("summation is " + sum);
		
		
		System.out.println("**************************");
		
		
		int k =1;
		while (k<=num) {
			sum1 = sum1 + k;
			k++;
					}
		System.out.println("summation is " + sum);
	}

}
