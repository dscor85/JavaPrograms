package javaExamples;

public class LargestAmoungThreeNumbers {

	public static void main(String[] args) {

		int x = 1200;
		int y = 900;
		int z = 1000;
		
		
		if (x>y && x>z) {
			System.out.println("x is the greatest");
			
		}
		
		else if (y>x && y>z) {
			System.out.println("y is the greatest");

		}
		else if (z>x && z>y){
			System.out.println("z is the greatest");

		}
		else {
			System.out.println("The numbs are equal");
		}
		
	}

}
