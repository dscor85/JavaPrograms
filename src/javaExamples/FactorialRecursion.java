package javaExamples;

public class FactorialRecursion {

	public static void main(String[] args) {

		
	System.out.println(multiplyNum(5));
	System.out.println(multiplyNum(0));	
		
		
	}
	
	public static int multiplyNum(int num) {
		
		if (num>=1) {
			return num * multiplyNum(num-1);
		}
		else {
			return 1;
		}
	}
	

}
