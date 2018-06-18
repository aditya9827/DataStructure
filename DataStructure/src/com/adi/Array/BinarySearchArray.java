package com.adi.Array;

public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] generatedArray = new int[20];
		// GenerateArray generate = new GenerateArray();
		generatedArray = BasicArrayFunctionality.createArray(10);
		
		//generatedArray = {100,90};
		BasicArrayFunctionality.printArray(generatedArray);
		
		//1. Sort the Array First
		//System.out.println("After sorting the array");
		//BasicArrayFunctionality.selectionSort();
		generatedArray = SelectionSort.selectionSort(generatedArray);
		System.out.println("After sorting the array");
		BasicArrayFunctionality.printArray(generatedArray);
		// 
		
		int numberToSearch = 10;
		
		if(numberToSearch == (generatedArray[(generatedArray.length - 1) / 2])) {
			
		}
		

	}

}
