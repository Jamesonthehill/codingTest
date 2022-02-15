package com.dormain.ch04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i =2; i<= 9; i++) {
			for(int j =2; j<=9; j++){
				int a = i*j;
				int b += a;
					//	System.out.println(i + "x" + j + "=" + a );
					if(a%2==0) {
						System.out.println("짝수의 합: " + a);
					}
					else {
						
						System.out.println("홀수의 합: " + a);
					}
				}
		
		
	 }
	}
}
