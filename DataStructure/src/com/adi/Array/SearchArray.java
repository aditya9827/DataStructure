package com.adi.Array;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberToSearch = 8;
		int[] generatedArray = new int[20];
		//GenerateArray generate = new GenerateArray();
		generatedArray = BasicArrayFunctionality.createArray(10);
		
		//System.out.println("Original Array");
		for (int i = 0; i<generatedArray.length;i++) {
			 System.out.println(generatedArray[i]);
		}
		
		System.out.println("Search Number: " + numberToSearch);
		for(int i = 0; i< generatedArray.length; i++) {
			if(generatedArray[i] == numberToSearch) {
				System.out.println("Number present at location: " +i);
				break;
			}else if(i+1 == generatedArray.length) {
				System.out.println("Number not present");
			}
			
		}
		
		

	}

}
