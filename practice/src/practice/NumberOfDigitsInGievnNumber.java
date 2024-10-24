package practice;

import java.util.Scanner;

public class NumberOfDigitsInGievnNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int input = scan.nextInt();
		scan.close();

		System.out.println("number of digits in " + input + " are: " + numberOfDigitsInGivenNumber(input));
	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static int numberOfDigitsInGivenNumber(int input) {
		int digits = 0;

		if (input == 0) {
			return 1; // Handle zero case directly
		}

		input = Math.abs(input); // Convert to positive for consistent handling

		while (input > 0) {
			digits++;
			input /= 10;
			if (input == 0) {
				return digits; // Early return if input becomes zero
			}
		}

		return digits;
	}

}
