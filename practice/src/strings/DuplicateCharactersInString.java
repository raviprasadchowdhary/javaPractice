package strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scan.nextLine();
		scan.close();

		duplicateCharactersInString(input);
	}

	public static void duplicateCharactersInString(String input) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] inputCharacterArray = input.toCharArray();

		for (char c : inputCharacterArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		Set<Character> ch = charCountMap.keySet();
		for (char c : ch) {
			if (c != ' ' && charCountMap.get(c) > 1) {
				System.out.println(c + ": " + charCountMap.get(c));
			}
		}
	}
}
