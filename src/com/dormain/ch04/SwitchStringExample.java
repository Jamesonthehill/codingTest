package com.dormain.ch04;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String position ="과장";

		switch(position) {
		case "사원": 
			System.out.println("월급 300만");
			break;
		
		case "대리":
			System.out.println("월급 400만");
			break;
		
		case "과장":
			System.out.println("월급 500만");
			break;
		
		case "부장":
			System.out.println("월급 600만");
			break;
		
		default:
			System.out.println("기본급 적용");
			break;
			
		}

		}
}