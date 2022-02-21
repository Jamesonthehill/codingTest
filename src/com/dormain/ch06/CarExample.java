package com.dormain.ch06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
					Car car = new Car();
				
				
				// car. 이건 앞에 거 참조하겟다는 의미이다.
				System.out.println("name: " + car.name);
				System.out.println("model:" + car.model);
				System.out.println("color: " + car.color );
				System.out.println("maxSpeed: "+ car.maxSpeed);
				System.out.println("speed: "+ car.speed);
				
				car.speed = 100;
				
				System.out.println("speed: "+ car.speed);
				
				// speed가 maxSpeed보다 속도가 높은지 낮은 출력해주는 함수를 만들어 출력하여라.
				
				upDown(car.maxSpeed, car.speed);
	}
	
	public static void upDown(int maxSpeed, int speed) {
		
			if(speed > maxSpeed) {
			 System.out.println("speed가 더 빠릅니다.");
			} else if(maxSpeed > speed) {
			 System.out.println("maxspeed가 더 빠릅니다.");
			} else {
				System.out.println("같은 값입니다.");
			}
	}
}	
