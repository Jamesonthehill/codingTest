package com.dormain.ch04;

public class codingtest4part {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int a= 2;
		int b= -2;   // 주의할것, if(조건문) , else if (조건문) , else 조건문 없음 *** // 
		
			if(a>0 && b>0) {
				System.out.println("1사분면");
			}
		
			else if(a>0 && b<0) {
				System.out.println("2사분면");
			}
			
			else if(a<0 && b<0) {
				System.out.println("3사분면");
			}
			
			else  { 
				System.out.println("4사분면");
			}
			
	}
}
