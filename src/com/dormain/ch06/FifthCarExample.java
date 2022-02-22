package com.dormain.ch06;

public class FifthCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			FifthCar fifthcar = new FifthCar();
		
				fifthcar.keyTurnOn();
				fifthcar.run();
				int speed = fifthcar.getSpeed();
				System.out.println("현재속도: " + speed + "km/h");

	}
}
