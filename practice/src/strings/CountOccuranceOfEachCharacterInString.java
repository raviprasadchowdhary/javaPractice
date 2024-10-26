package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOccuranceOfEachCharacterInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		scan.close();

		countCharacterOccurrencesInString(input);
	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void countCharacterOccurrencesInString(String input) {
		Map<Character, Integer> countOfCharacterMap = new HashMap<Character, Integer>();
		char[] inputCharacterArray = input.toCharArray();

		for (char c : inputCharacterArray) {
			if (countOfCharacterMap.containsKey(c)) {
				countOfCharacterMap.put(c, countOfCharacterMap.get(c) + 1);
			} else {
				countOfCharacterMap.put(c, 1);
			}
		}

		Set<Character> charactersSet = countOfCharacterMap.keySet();
		for (char c : charactersSet) {
			System.out.println(c + ": " + countOfCharacterMap.get(c));
		}
	}
}
