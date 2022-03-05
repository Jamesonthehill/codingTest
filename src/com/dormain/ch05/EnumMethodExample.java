package com.dormain.ch05;

import java.util.Calendar;
  													// Ctrl + shift + o 누르면 자동 import 생성
public class EnumMethodExample {

	
	public static void main(String[] args) { //  함수. function


//			Week abc = Week.MONDAY;
//			System.out.println(abc);
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();   // 이 두줄은 그냥 외워놓으셈
		int week = cal.get(Calendar.DAY_OF_WEEK); // 이 두줄은 그냥 외워놓으셈
		
		switch(week) {
		case 1:
			today = Week.SUNDAY ; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY ; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		
		}
		System.out.println("오늘의 요일: " + today);
		
		if(today == Week.SUNDAY) {
				System.out.println("일요일에는 축구를 합니다.");
		} else {
				System.out.println("열심히 자바 공부를 합니다.");
		}
		
	}	

}
