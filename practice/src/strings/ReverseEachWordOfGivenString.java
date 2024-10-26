package strings;

import java.util.Scanner;

public class ReverseEachWordOfGivenString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string of which each word is to be reversed: ");
		String input = scan.nextLine();
		scan.close();

		reverseEachWordOfGivenString(input);
	}

	public static void reverseEachWordOfGivenString(String input) {
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			String reversedWord = "";
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reversedWord += words[i].charAt(j);
			}
			System.out.print(reversedWord);
			if (i < words.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
