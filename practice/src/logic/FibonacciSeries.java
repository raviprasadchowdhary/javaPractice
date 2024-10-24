package logic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range for the Fibonacci series: ");
		int input = scan.nextInt();
		scan.close();

		System.out.print("Fibonacci series with range " + input + " is10: ");
		fibonacciPrint(input);

	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void fibonacciPrint(int input) {
		int first = 0, second = 1, next;

		for (int i = 0; i < input; i++) {
			System.out.print(first + " ");
			next = first + second;
			first = second;
			second = next;
		}
	}

}
