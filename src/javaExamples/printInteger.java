package javaExamples;

import java.util.Scanner;

public class printInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("enter integer");
		int num = reader.nextInt();
		System.out.println("entered number is: "+ num);
		
		reader.close();
		
	}

}
