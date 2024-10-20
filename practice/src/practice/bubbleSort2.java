package practice;

public class bubbleSort2 {

	public static void main(String[] args) {
		int[] inputArray = { 64, 34, 25, 12, 22, 11, 90 };

		System.out.print("Before sort: ");
		printArray(inputArray);

		bubbleSortTheArray(inputArray);

		System.out.print("After sort: ");
		printArray(inputArray);

	}
	
	/*
	 * 	==========================================================================================================
	 * 	Methods
	 * 	==========================================================================================================
	*/
	
	// print array
	public static void printArray(int[] input) {
		for (int i : input) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	//	bubble sort the array
	public static void bubbleSortTheArray(int[] input) {
		int l = input.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = temp;
				}
			}
		}
	}

}
