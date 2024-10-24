package logic;

import java.util.Scanner;

public class SumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		
		System.out.println("Sum of digits of " + input + " is " + sumOfDigits(input));
	}
	
	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */
	
	public static int sumOfDigits(int input) {
		int sumOfDigits = 0, reminder = 0;
		
		while(input>0) {
			reminder = input % 10;
			sumOfDigits += reminder;
			input /= 10;
		}
		
		return sumOfDigits;
	}

}
