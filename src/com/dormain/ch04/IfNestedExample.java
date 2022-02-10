package com.dormain.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int score = 88;
			String grade = "";
			
			if(score >= 95) {
				grade = "a+";
			} if (score >= 90) {
				grade = "a";
			}
			  if (score >= 85) {
				grade = "b+";
			}
			  if (score >= 80) {
				grade = "bc+";
			}
			  if (score >= 75){
				grade = "c";
			}
				System.out.println("학점:" + grade);
				
	}

}
