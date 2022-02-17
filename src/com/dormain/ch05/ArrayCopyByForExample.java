package com.dormain.ch05;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		
			int[] arr1 = {1, 2 ,3};
			int[] arr2 = new int [5];
			
			for(int i=0; i< arr1.length; i++) {
				arr2[i] = arr1[i];
			}
			arr2[3] = 4;
			arr2[4] = 5;
	
			for(int i=0; i<arr2.length; i++) {
					System.out.println(arr2[i]);
			}
	}

}
