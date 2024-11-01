package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String inputString = scan.nextLine();
		scan.close();

		uniqueCharacters(inputString);

	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static void uniqueCharacters(String input) {
		Set<Character> uniqueCharacter = new HashSet<Character>();
		for (char c : input.toCharArray()) {
			uniqueCharacter.add(c);
		}

		System.out.print("Unique characters are: ");
		for (char c : uniqueCharacter) {
			if (c == ' ') {
				continue;
			}
			System.out.print(c + " ");
		}
	}
}
