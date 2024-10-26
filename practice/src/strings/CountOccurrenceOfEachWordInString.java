package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOccurrenceOfEachWordInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		scan.close();

		countOccurrenceOfWordInString(input);
	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void countOccurrenceOfWordInString(String input) {
		Map<String, Integer> countOfWordMap = new HashMap<String, Integer>();
		String[] inputWordArray = input.split(" ");

		for (String s : inputWordArray) {
			if (countOfWordMap.containsKey(s)) {
				countOfWordMap.put(s, countOfWordMap.get(s) + 1);
			} else {
				countOfWordMap.put(s, 1);
			}
		}

		Set<String> word = countOfWordMap.keySet();
		for (String s : word) {
			System.out.println(s + " : " + countOfWordMap.get(s));
		}
	}

}
