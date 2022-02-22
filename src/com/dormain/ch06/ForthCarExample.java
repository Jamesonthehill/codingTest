package com.dormain.ch06;

public class ForthCarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			FourthCar forthcar = new FourthCar();
	
			forthcar.setGas(3);
			
			boolean gasState = forthcar.isLeftGas();
			if(gasState) {
				System.out.println("출발합니다.");
				forthcar.run();
			}
			
			if(forthcar.isLeftGas()) {
				System.out.println("Gas를 주입할 필요가 없습니다.");
			} else {
				System.out.println("Gas를 주입하세요.");
			}
	} 

}
