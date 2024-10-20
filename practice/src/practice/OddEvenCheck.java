package practice;

import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int input = scan.nextInt();
		scan.close();
		
		if(evenCheck(input) == true) {
			System.out.println(input + " is even number");
		}else {
			System.out.println(input + " is odd number");
		}
		
		System.out.println("Completed code execution");
	}
	
	/*
	 * 	==========================================================================================================
	 * 	Methods
	 * 	==========================================================================================================
	*/
	
	public static boolean evenCheck(int input) {
		if(input % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
