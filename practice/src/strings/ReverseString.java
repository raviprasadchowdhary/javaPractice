package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string to be reversed: ");
		String input = scan.next();
		scan.close();

		System.out.println(input + " after reversing is: " + reverseString(input));
		System.out.println(input + " after reversing is: " + reverseStringByStringBuilder(input));

	}

	public static String reverseString(String input) {
		char c;
		String newString = "";

		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			newString = c + newString;
		}
		return newString;
	}

	public static String reverseStringByStringBuilder(String input) {
		StringBuilder reversedString = new StringBuilder(input);
		return reversedString.reverse().toString();
	}
}