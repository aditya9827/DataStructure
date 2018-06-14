package com.adi.Array;

public class DeleteFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] generatedArray = new int[30];

		int numberToDelete = 4;
		generatedArray = BasicArrayFunctionality.createArray(8);

		System.out.println("Original Array");
		for (int i = 0; i < generatedArray.length; i++) {
			System.out.println(generatedArray[i]);
		}

		System.out.println("Number to Delete: " + numberToDelete);

		for (int i = 0; i < generatedArray.length; i++) {
			if (generatedArray[i] == numberToDelete) {
				for (int j = i; j < generatedArray.length - 1; j++) {
					generatedArray[j] = generatedArray[j + 1];
				}
				System.out.println("Number deleted.");
				break;
			}
		}

		System.out.println("Array after deletion");
		BasicArrayFunctionality.printArrayAfterDeletion(generatedArray);

	}

}
