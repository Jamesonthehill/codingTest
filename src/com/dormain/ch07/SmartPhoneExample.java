package com.dormain.ch07;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
	//	Phone phone = new Phone(); // 추상클래스는 걕체 생성불가
		
		SmartPhone smartPhone = new SmartPhone("asd");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
		
		
		
		
		
		
	}

}
