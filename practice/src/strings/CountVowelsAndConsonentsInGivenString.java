package strings;

import java.util.Scanner;

public class CountVowelsAndConsonentsInGivenString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scan.nextLine();
		scan.close();

		countConsonantAndVowel(inputString);

	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void countConsonantAndVowel(String input) {
		input = input.toLowerCase();
		int vowel = 0, consonent = 0;
		char[] inputCharacterArray = input.toCharArray();
		for (char c : inputCharacterArray) {
			if ((c >= 'a') && (c <= 'z')) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowel++;
				} else {
					consonent++;
				}
			}
		}

		System.out.println("Vowels in string are: " + vowel);
		System.out.println("Consonents in string are: " + consonent);
	}
}
