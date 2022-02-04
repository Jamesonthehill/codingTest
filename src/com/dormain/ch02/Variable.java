package com.dormain.ch02;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//  변수 명명법
//	첫글자 소문자 그리고 다음 문자열 부터는 대문자

//	모든 변수명은 붙여서 사용		
		int roomNumber = 1;
		int roomnumber = 2;
		
		
//	대소문자 구분함
		String fullName = "Wonyoung Chang";
		String name = "kimwoobin";
		
		System.out.println("roomNumber: " + roomNumber);
		System.out.println("roomnumber: " + roomnumber);
// 예약어는 사용 할 수 없다		
//	int int = 2;		
	
	
	// 선언
		int a; // a변수 사용은 불가능 상태. error 뜰것임.
		int b;
		b= 20; // 대입
		
		int c = 30; // 선언과 초기화
		
		a = b + c ;
		System.out.print(a);
	
	
		
		boolean aa = false;
		byte bb = 0;
		int cc = 0;
		long d = 0;
		
		float ff = 0.0f;
		double e = 0.0;
		
		char g = '김';
		String h = "시간아 멈춰";		
	
	
		System.out.println("한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		
		System.out.println("한줄바꿈1");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈2");
		System.out.println("\r한줄바꿈");
		
		System.out.println("'나는생각한다'");
		System.out.println("쏘크라테스가 말했다 \"나는 존재한다\"");
		System.out.println("\\");
		System.out.println();
		
	}
}
