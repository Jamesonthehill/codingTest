package com.dormain.ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// 아래처럼 일반클래스 만들듯이 만들면 안된다
//		Audio audio = new Audio();
		Television television = new Television();
		
		// 얘는 일일히 다바꿔줘야됨.
//		audio.turnOn();
//		audio.turnOff();
		television.turnOn();
		television.turnOff();
		
		//인터페이스를 구현한 클래스를 사용해야한다.
//		RemoteControl remoteControl; // 인터페이스 변수선언
//		remoteControl = new Audio(); // 구현객체로 초기화
// -------------------------------------------------------
		RemoteControl remoteControl = new Television();
		RemoteControl remoteControl2 = new Audio();
		
		remoteControl2.turnOn();
		remoteControl2.turnOff();
		
		remoteControl.turnOn();
		remoteControl.turnOff();
		
	}

}
