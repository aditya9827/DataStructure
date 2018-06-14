package com.adi.Array;

public class InsertIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] generatedArray = new int[20];
		//GenerateArray generate = new GenerateArray();
		generatedArray = BasicArrayFunctionality.createArray(10);
		
//		System.out.println("Original Array");
//		for (int i = 0; i<generatedArray.length;i++) {
//			 System.out.println(generatedArray[i]);
//		}
		
		System.out.println("Original Array");
		BasicArrayFunctionality.printArray(generatedArray);
		
		System.out.println("After inserting");
		
		generatedArray[2] = 100;
		BasicArrayFunctionality.printArray(generatedArray);
	}

}
