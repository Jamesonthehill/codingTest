package com.dormain.ch08;

public interface RemoteControl {

		public String name ="Tony";
		
		//실수
		int MAX_VOLUME = 10; // public static final 이 생략되어있음
		int MIN_VOLUME = 0;
		
		// 추상 메서드 : 구현 클래스에서 무조건 오버라이드 해야 된다.
		void turnOn();
		void turnOff();
		void SetVolume(int volume);
		
		//디폴트 메서드 : public 생략가능
		default void setMute(boolean mute) {
			if(mute ) {
				System.out.println("무음 처리합니다");
				
			} else {
				System.out.println("무음 해제합니다.");
			}
		}
		
		//정적 메소드 : public 생략가능
		public static void changeBattery() {
			System.out.println("건전지를 교체합니다.");
		}
}
