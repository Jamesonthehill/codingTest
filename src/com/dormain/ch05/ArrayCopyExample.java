package com.dormain.ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2 ,3};
		int[] arr2 = new int [5];
		
		for(int i =0; i < arr2.length; i++){
				System.out.println(arr2[i]);
		}
			
		System.out.println();
		
//		System.arraycopy(arr1, 1 , arr2, 2 , arr1.length-1); //arr1이 원본이라 src라하고 arr2가 데이터 복사 받을 녀석이라 
//		dest라고 하는데 두번쨰 파라미터는 srcPos로 원본에 몇번째 인덱스부터 읽을거냐는거고 destPost는 복사받은 arr2에 어느 인덱스부터 복사 받겠냐는 겁니다
//		:흰색_확인_표시:


		
		for(int i=0; i <arr2.length; i++) {
				System.out.println(arr2[i]);
		}
//		for(int i=0; i< arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		arr2[3] = 4;
//		arr2[4] = 5;
//
//		for(int i=0; i<arr2.length; i++) {
//				System.out.println(arr2[i]);
//		}		
		
	}

}
