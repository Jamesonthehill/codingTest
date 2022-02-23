package com.dormain.ch06;

public class SixthCarExample {
	static String name = "장원영";
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			name = "전지현";
			
			SixthCar myCar = new SixthCar("포르쉐");
			SixthCar yourCar = new SixthCar("벤츠");
			
			myCar.run();
			yourCar.run();
			
			print("asdf");
			
	}

		public static void print(String msg) {
			System.out.println(msg);
		}
}
