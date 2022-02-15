package com.dormain.ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] score = {83, 90, 87};
		
		System.out.println("score.length: " + score.length);
		
		int sum = 0;
		int avr = 0;
		for(int i = 0; i < score.length; i++) {  //score.length는 갯수구하는거임.
				sum += score[i];
				avr = sum/score.length;
		}
			System.out.println("총합: " + sum);
			System.out.println("평균: " + avr);
		
		
		
	}

}
