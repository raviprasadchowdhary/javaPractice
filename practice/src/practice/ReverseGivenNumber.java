package practice;

import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number to be reversed: ");
		int input = scan.nextInt();
		scan.close();
		
		System.out.print("Reverse of given number is: " + revrseGivenNumber(input));
		
	}
	
	public static int revrseGivenNumber(int number) {
		int reverse = 0, reminder;
		
		while(number>0) {
			reminder = number%10;
			number = number/10;
			reverse = (reverse*10) + reminder;
		}
		
		return reverse;
	}

}
