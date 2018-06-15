package com.adi.Array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] generatedArray = new int[20];
		// GenerateArray generate = new GenerateArray();
		generatedArray = BasicArrayFunctionality.createArray(10);
		
		int arrayLength = generatedArray.length;
		int arrayMin = 0;
		int arrayMax = 0;
		//generatedArray = {100,90};
		BasicArrayFunctionality.printArray(generatedArray);
		
		for(int i =0; i < arrayLength - 1; i++) {
			arrayMin = generatedArray[i];
			for(int j =i+1; j< arrayLength ; j++) {
				if(arrayMin > generatedArray[j]) {
					arrayMax = arrayMin;
					arrayMin = generatedArray[j];
					generatedArray[j] = arrayMax;
				}
			}
			//arrayMax = generatedArray[i];
			generatedArray[i] = arrayMin;
		}
		
		System.out.println("After selection sort");
		BasicArrayFunctionality.printArray(generatedArray);

	}

}
