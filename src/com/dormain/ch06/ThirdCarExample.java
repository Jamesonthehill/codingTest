package com.dormain.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ThirdCar ThirdCar = new ThirdCar(); // 오버로드에있는 자바를 가져오겠다.
	
	System.out.println("company : " + ThirdCar.company);
	System.out.println("model :" + ThirdCar.model);
	System.out.println("color : " + ThirdCar.color);
	System.out.println("maxSpeed : " + ThirdCar.maxSpeed);

	ThirdCar ThirdCar1 = new ThirdCar("그란카브리오");
	System.out.println("-------------");
	System.out.println("company : " + ThirdCar1.company);
	System.out.println("model :" + ThirdCar1.model);
	System.out.println("color : " + ThirdCar1.color);
	System.out.println("maxSpeed : " + ThirdCar1.maxSpeed);
	
	ThirdCar ThirdCar2 = new ThirdCar("우라칸", "Red");
	
	System.out.println("-------------");
	System.out.println("company : " + ThirdCar2.company);
	System.out.println("model :" + ThirdCar2.model);
	System.out.println("color : " + ThirdCar2.color);
	System.out.println("maxSpeed : " + ThirdCar2.maxSpeed);

	
	ThirdCar ThirdCar3 = new ThirdCar("멕라렌","Blue",200);
	
	System.out.println("-------------");
	System.out.println("company : " + ThirdCar3.company);
	System.out.println("model :" + ThirdCar3.model);
	System.out.println("color : " + ThirdCar3.color);
	System.out.println("maxSpeed : " + ThirdCar3.maxSpeed);
}
}
