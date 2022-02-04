package com.dormain.ch02;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10을 변수 value의 초기값으로 저장
		int value = 10;
		
		// value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result 의 초기값으로 저장
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println("총합은 :" + result);
	
	
	// 변수의 범위
	// 변수는 선언된 블럭 내에서만 사용 가능하다.
		int a = 1;
		if(a == 1) {
			int aaa = 10;
			int bbb = aaa + a;
			System.out.println("bbb: " + bbb);
		} else {
			
			
		}
//			System.out.println();
	
	
	
	
	
	
	
	
	
	
	}

}
