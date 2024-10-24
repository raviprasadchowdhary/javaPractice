package practice;

import java.util.Scanner;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		scan.close();

		if (isPalindrome(input)) {
			System.out.println(input + " is Palindrome");
		} else {
			System.out.println(input + " is not a Palindrome");
		}

	}

	public static boolean isPalindrome(int input) {
		int reminder = 0, reverse = 0, originalValue = input;

		while (input > 0) {
			reminder = input % 10; // Extract the last digit
			input /= 10; // Remove the last digit
			reverse = reverse * 10 + reminder; // Build the reversed number
		}

		return originalValue == reverse; // Compare the original number with the reversed number
	}

}
