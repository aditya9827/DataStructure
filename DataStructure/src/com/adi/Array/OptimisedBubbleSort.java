package com.adi.Array;

public class OptimisedBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optimizedBubbleSort();
		

	}

	/**
	 * 
	 */
	static void optimizedBubbleSort() {

		int[] generatedArray = new int[20];
		
		boolean swapped = false;
		int arrayLength;
		// GenerateArray generate = new GenerateArray();
		generatedArray = BasicArrayFunctionality.createArray(10);
		arrayLength = generatedArray.length;
		
		BasicArrayFunctionality.printArray(generatedArray);
		
		for(int i = 0; i < arrayLength - 1; i++) {
			swapped = false;
			for(int j = 0; j < arrayLength - i -1; j ++) {
				if (generatedArray[j] > generatedArray[j + 1]) {
					// swap(generatedArray[j], generatedArray[j+1]);
					generatedArray[j + 1] = generatedArray[j] + generatedArray[j + 1];
					generatedArray[j] = generatedArray[j + 1] - generatedArray[j];
					generatedArray[j + 1] = generatedArray[j + 1] - generatedArray[j];
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
			System.out.println("After " + (i+1) + "iteration");
			BasicArrayFunctionality.printArray(generatedArray);
		}
	}

}
