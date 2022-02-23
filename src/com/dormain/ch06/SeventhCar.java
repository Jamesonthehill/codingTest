package com.dormain.ch06;

public class SeventhCar {
	int speed = 0;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
//		speed = 10;
//		run();
		SeventhCar seventhcar = new SeventhCar();
		seventhcar.speed= 10;
		seventhcar.run();
	
	}
}