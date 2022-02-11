package com.dormain.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//					int sum = 0;
//					
//				for(int i=1; i<=10; ++i) {
//					sum += i;
////					 sum = sum + i; 
//					if(i%2) {
//						int sum = 0;
//						sum += i;
//					}
//				}
//					System.out.println("합: " + sum);
//				}
//	}

				
				for(int i =1; i<= 9; i++) {
					for(int j =1; j<=9; j++){
						System.out.print(i + "x"+ j +"=" + i*j + "\t");
				}
					System.out.println(i);
				}
				
	}
}
