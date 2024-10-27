package strings;

import java.util.Scanner;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String inpString = scan.nextLine();
		scan.close();

		System.out.println("Number of words in the input string are: " + countNumberOfWordsInString(inpString));
	}

	public static int countNumberOfWordsInString(String inpString) {
		int count = 1;
		for (int i = 0; i < inpString.length() - 1; i++) {
			if (inpString.charAt(i) == ' ' && inpString.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

}
