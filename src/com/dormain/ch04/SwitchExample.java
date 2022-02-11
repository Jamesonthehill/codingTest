package com.dormain.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//			int num = 5;
//		
//			switch(num) {    // () 안에 정수나 문자열이 와야된다. 
//				
//			case 1:
//				System.out.println("1번");
//					break;
//					
//			case 2:
//				System.out.println("2번");
//				break;
//				
//			case 3:
//				System.out.println("3번");
//				break;
//				
//			case 4:
//				System.out.println("4번");
//				break;
//				
//			case 5:
//				System.out.println("5번");
//				break;
//				
//			case 6:
//				System.out.println("6번");
//				break;
//				
//			default:
//				System.out.println("무번");
//				break;
//				
//			}
//	}



//	 			Math.random() : 0.0 ~ 1.0 에 가까운 double 형 값을 보내줌
//	 			
	 			
	 			
//	 			String a = "A"; 
		int num = (int) (Math.random() * ( 6 - 1 + 1 ) + 1 );
					
	 				switch (1) {
	 					case 1:
	 					 System.out.println("첫번째 주사위: " + num);
	 					 
	 					case 2:
	 					System.out.println("두번째 주사위: " + num );
	 						
	 					case 3:
	 						System.out.println("두 수의 합: " +  (num+num));
	 						break;
	 						
	 				}
	 			}
}