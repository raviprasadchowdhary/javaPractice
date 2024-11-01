package strings;

import java.util.Scanner;

public class PrintEvenIndexedCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String inputString = scan.nextLine();
		scan.close();

		evenIndexedCharacters(inputString);
		System.out.println();
		evenIndexedCharacters2(inputString);

	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void evenIndexedCharacters(String input) {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.print("Even indexed characters in \"" + input + "\" are: ");
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(input.charAt(i) + " ");
			}
		}
	}

	public static void evenIndexedCharacters2(String input) {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.print("Even indexed characters in \"" + input + "\" are: ");
		for (int evenIndChar = 0; evenIndChar < input.length(); evenIndChar += 2) {
			System.out.print(input.charAt(evenIndChar) + " ");
		}
	}
}
