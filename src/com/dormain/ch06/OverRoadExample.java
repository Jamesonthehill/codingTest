package com.dormain.ch06;

public class OverRoadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			OverRoad overroad = new OverRoad();
		
			System.out.println("company : " + overroad.company);
			System.out.println("model :" + overroad.model);
			System.out.println("color : " + overroad.color);
			System.out.println("maxSpeed : " + overroad.maxSpeed);

			OverRoad overroad1 = new OverRoad("그란카브리오");
			System.out.println("-------------");
			System.out.println("company : " + overroad1.company);
			System.out.println("model :" + overroad1.model);
			System.out.println("color : " + overroad1.color);
			System.out.println("maxSpeed : " + overroad1.maxSpeed);
			
			OverRoad overroad2 = new OverRoad("우라칸", "Red");
			
			System.out.println("-------------");
			System.out.println("company : " + overroad2.company);
			System.out.println("model :" + overroad2.model);
			System.out.println("color : " + overroad2.color);
			System.out.println("maxSpeed : " + overroad2.maxSpeed);
	
			
			OverRoad overroad3 = new OverRoad("멕라렌","Blue",200);
			
			System.out.println("-------------");
			System.out.println("company : " + overroad3.company);
			System.out.println("model :" + overroad3.model);
			System.out.println("color : " + overroad3.color);
			System.out.println("maxSpeed : " + overroad3.maxSpeed);
	}
}
