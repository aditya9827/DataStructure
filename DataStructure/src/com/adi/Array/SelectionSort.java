package com.adi.Array;

public class SelectionSort {

	//static int[] generatedArray = new int[20]; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] generatedArray = new int[20];
		//int[] generatedArray = {10,9,8,8,6,5,4,3,2,1};
		// GenerateArray generate = new GenerateArray();
		generatedArray = BasicArrayFunctionality.createArray(10);
		
		int arrayLength = generatedArray.length;
		int indexMin = 0;
		int indexMax = 0;
		int arrayMin = 0;
		int numberofSwaps = 0;
		boolean swapNumber = false;
		//generatedArray = {100,90};
		BasicArrayFunctionality.printArray(generatedArray);
		
		for(int i =0; i < arrayLength - 1; i++) {
			arrayMin = generatedArray[i];
			indexMin = i;
			for(int j =i+1; j< arrayLength ; j++) {
				if(arrayMin > generatedArray[j]) {
					indexMax = j;
					
					arrayMin = generatedArray[j];
					swapNumber = true;
				}
			}
			if(swapNumber) {
				int temp = generatedArray[indexMin];
				
				generatedArray[indexMin] = generatedArray[indexMax];
				generatedArray[indexMax] = temp;
				swapNumber = false;
				numberofSwaps++;
			}
			
			
			System.out.println("After " + (i+1) + "iteration");
			BasicArrayFunctionality.printArray(generatedArray);
		}
		
		System.out.println("After selection sort");
		System.out.println("Total Number of Swaps: " + numberofSwaps);
		BasicArrayFunctionality.printArray(generatedArray);

	}

//	private static void swap(int indexMin, int indexMax) {
//		// TODO Auto-generated method stub
//		int temp = generatedArray[indexMin];
//		
//		generatedArray[indexMin] = generatedArray[indexMax];
//		generatedArray[indexMax] = generatedArray[indexMin];
//		
//	}

}
