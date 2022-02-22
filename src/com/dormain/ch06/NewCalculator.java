package com.dormain.ch06;


public class NewCalculator {

			int plus(int x, int y) { 
				int result = x + y;
				return result;
			}
			
			double avg(int x, int y) {
					double sum = plus(x,y); // plus() 함수로 올라감
					double result = sum / 2;
					return result;
			}
			
			void execute() {
				double result = avg(7, 10); // avg 함수로 올라감
				println("실행결과: " + result);
			}
				
			void println(String message) {
				System.out.println("message : "+ message);
			} 
}
