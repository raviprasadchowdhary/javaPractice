package practice;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number of which factorial is to be caculated: ");
		int input = scan.nextInt();
		scan.close();
		
		int factorial = calculateFactorial(input);
		
		System.out.println("Factorial of " + input + " by iterative method is: " + factorial);
		System.out.println("Factorial of " + input + " by recursive method is: " + factorial);
		
	}
	
	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */
	
//	method to calculate the factorial of given number
	public static int calculateFactorial(int input) {
		int factorial = 1;
		
		for(int i=input; i>0; i--) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
//	method to calculate the factorial of a given number with recursion
	public static int calculateFactorialRecursively(int input) {
		
		if(input ==0 || input ==1) {
			return 1;
		}else {
			return input * calculateFactorial(input-1);
		}
	}

}
