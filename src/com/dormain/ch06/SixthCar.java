package com.dormain.ch06;

public class SixthCar {

	String model;
	int speed;
	
	public SixthCar(String model) {
		this.model = model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h");
		}
	}
	
	public void aa() {
	SeventhCar seventhCar = new SeventhCar();
	}
	
}
