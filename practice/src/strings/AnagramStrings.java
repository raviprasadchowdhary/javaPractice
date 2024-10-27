package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string1: ");
		String inpString1 = scan.next();
		System.out.print("Enter string2: ");
		String inpString2 = scan.next();
		scan.close();

		System.out.println("String1 & String2 are anagrams: " + areAnagramStrings(inpString1, inpString2));
	}

	/*
	 * =============================================================================
	 * Methods
	 * =============================================================================
	 */

	public static boolean areAnagramStrings(String input1, String input2) {
		Map<Character, Integer> countOfCharatcerInput1 = new HashMap<Character, Integer>();
		Map<Character, Integer> countOfCharatcerInput2 = new HashMap<Character, Integer>();
		char[] inputCharArray1 = input1.toCharArray();
		char[] inputCharArray2 = input2.toCharArray();

		for (char c : inputCharArray1) {
			if (countOfCharatcerInput1.containsKey(c)) {
				countOfCharatcerInput1.put(c, countOfCharatcerInput1.get(c) + 1);
			} else {
				countOfCharatcerInput1.put(c, 1);
			}
		}

		for (char c : inputCharArray2) {
			if (countOfCharatcerInput2.containsKey(c)) {
				countOfCharatcerInput2.put(c, countOfCharatcerInput2.get(c) + 1);
			} else {
				countOfCharatcerInput2.put(c, 1);
			}
		}

		return countOfCharatcerInput1.equals(countOfCharatcerInput2);

	}
}
