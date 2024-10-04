package practice;

public class bubbleSort {

	public static void main(String[] args) {
		int[] inputArray = { 64, 34, 25, 12, 22, 11, 90 };
		
		System.out.println("Before sort");
		printArray(inputArray);
		
		bubbleSortArray(inputArray);
		
		System.out.println("After sort");
		printArray(inputArray);
		

	}

	public static void bubbleSortArray(int[] inputArray) {

		int n = inputArray.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					//swap elements
					int temp = inputArray[j + 1];
					inputArray[j + 1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}

	}
	
	public static void printArray(int[] inputArray) {
		for(int num : inputArray) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
