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
		String reversedString = "";

		for (int i = input.length()-1; i >=0; i--) {
	        reversedString += input.charAt(i); // Append characters to the end of newString
	    }
		return reversedString;
	}

	public static String reverseStringByStringBuilder(String input) {
		StringBuilder reversedString = new StringBuilder(input);
		return reversedString.reverse().toString();
	}
}