package com.dormain.ch05;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) { // 주소비교
				System.out.println("1strVar1과 strVar2는 참조가 같음");
		} else {
				System.out.println("2strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) { // 문자열 비교
				System.out.println("3strVar1과 strVar2는 문자열이 같음");
		} 
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
			
		if(strVar3 == strVar4) {  //주소비교
				System.out.println("4strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("5strVar1과 strVar2는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) { // 문자열비교
				System.out.println("6strVar1과 strVar2는 문자열이 같음");
			
		}
	}
}
