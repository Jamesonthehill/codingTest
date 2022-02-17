package com.dormain.ch05;

public class ArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//				int [] score; // 선언
//				
//				int score2 []; // 선언
//				
//				int[] score3 = {1,2,3}; // 객체 생성
//				
//				int score4[] = {4,5,6}; // 객체 생성
//
//				double[] score6 = {1,2,3,4};
//				
//				String[] strArray = {"김기춘","장원영","김제동","서장훈"};
	
//						입력이 되는 데이터 타입은 동일해야한다
//						순서는 무조건 0부터 시작이다 .index
//						총갯수를 원할하게 능릴수ㅡ없다
	
				int[] score= {83,90,87,99};
				
				
				System.out.println("score[0]: " + score[0]);
				System.out.println("score[1]: " + score[1]);
				System.out.println("score[2]: " + score[2]);
				System.out.println("score[3]: " + score[3]);
				
				double sum = 0;
				double avg = 0;
				for(int i=0; i< 4; i++) {
					sum += score[i];
					avg = sum/4;
				}
					System.out.println("평균: " + avg);
				}
	
	}
