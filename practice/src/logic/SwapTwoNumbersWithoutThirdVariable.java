package logic;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int input1 = scan.nextInt();
		System.out.println("Enter the number2: ");
		int input2 = scan.nextInt();

		swapTwoNumbersWithoutThirdVariable(input1, input2);		
	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void swapTwoNumbersWithoutThirdVariable(int input1, int input2) {
		System.out.println("number1 & number2 before swapping: " + input1 + " & " + input2);
//		input 2 & 3
		input1 = input1 + input2; // 5 3
		input2 = input1 - input2; // 5 2
		input1 = input1 - input2; // 3 2
		System.out.println("number1 & number2 after swapping: " + input1 + " & " + input2);
	}

}
