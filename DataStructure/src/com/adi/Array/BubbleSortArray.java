package com.adi.Array;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] generatedArray = {100,90,10,2,4};
		//normalBubbleSort();

	}


	

	/**
	 * 
	 */
	static void normalBubbleSort(int [] array) {
		int[] generatedArray = new int[20];
				
		generatedArray = array;
		// GenerateArray generate = new GenerateArray();
		//generatedArray = BasicArrayFunctionality.createArray(10);
		
		//generatedArray = {100,90};
		BasicArrayFunctionality.printArray(generatedArray);
		
		// Time Complexity O(N^2)
		for (int i = 0; i < generatedArray.length - 1; i++) {
			for (int j = 0; j < generatedArray.length - i - 1; j++) {
				if (generatedArray[j] > generatedArray[j + 1]) {
					// swap(generatedArray[j], generatedArray[j+1]);
					generatedArray[j + 1] = generatedArray[j] + generatedArray[j + 1];
					generatedArray[j] = generatedArray[j + 1] - generatedArray[j];
					generatedArray[j + 1] = generatedArray[j + 1] - generatedArray[j];
				}
			}
			System.out.println("After " + (i+1) + "iteration");
			BasicArrayFunctionality.printArray(generatedArray);
		}
		
		System.out.println("After bubble sorting");
		
		BasicArrayFunctionality.printArray(generatedArray);
	}

	// private static void swap(int a, int b) {
	// // TODO Auto-generated method stub
	// b = a + b;
	// a = b-a;
	// b = b-a;
	//
	// }

}
