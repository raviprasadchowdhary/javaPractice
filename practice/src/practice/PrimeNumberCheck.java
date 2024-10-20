package practice;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int input = scan.nextInt();
		scan.close();

		if (primeCheck(input) == true) {
			System.out.println(input + " is a prime number");
		} else {
			System.out.println(input + " is not a prime number");
		}

		System.out.println("Code execution completed");

	}

	/*
	 * =============================================================================
	 * ============================= Methods
	 * =============================================================================
	 * =============================
	 */

	public static boolean primeCheck(int input) {

		boolean isPrime = true;
		if (input <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(input); i++) {
				if (input % i == 0) {
					isPrime = false;
				}
			}
		}

		return isPrime;
	}

}
