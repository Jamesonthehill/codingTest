package com.dormain.ch06;

public class FourthCar {

			int gas; // 3 // 0
			
			void setGas(int gas) {
				this.gas = gas; // 3
			}

			boolean isLeftGas() {
				if(gas==0) {
					System.out.println("gas가없습니다.");
					return false;
				} // else 있으나 없으나 똑같음
				System.out.println("gas가 있습니다.");
				return true;
			}

			void run() {
				while(true) {
					if(gas > 0 ) {
						System.out.println("달립니다." + "(gas잔량:" + gas + ")");
						gas -= 1; // 3번 사이클돌아서 Gas : 0
					} else {
						System.out.println("멈춥니다.." + "(gas잔량:" + gas + ")");
						return;
					}
				}
			}

}
