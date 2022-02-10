package com.dormain.ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int a = 'A';
		int b = 'B';
		
		if( a > b ) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
//		} else if (score >= 70) {
//			System.out.println("70~79이다. 중간 성적입니다.");
//			System.out.println("C등급");
//		} else if (score >= 60) {
//			System.out.println("60~69이다. 노력이 필요합니다.");
//			System.out.println("D등급");
		} else {
			System.out.println("==");
		}	
	}

}
