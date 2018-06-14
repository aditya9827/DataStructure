package com.adi.Array;

public class BasicArrayFunctionality {
	
	public static int[] createArray(int size){
		int[] array = new int[size];
		for(int i =0; i <size; i++) {
			array[i] = i+1;
		}
		return array;
		
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i<array.length;i++) {
			 System.out.println(array[i]);
		}
	}
	
	public static void printArrayAfterDeletion(int[] array) {
		for (int i = 0; i<array.length-1;i++) {
			 System.out.println(array[i]);
		}
	}
}
