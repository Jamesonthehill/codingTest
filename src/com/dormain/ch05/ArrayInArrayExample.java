package com.dormain.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//			다차원배열
//			2 * n : (행 * 열) : 가로 * 세로
			
			int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55}};
//			for(int i=0; i<scores.length; i++) {
//				for(int j=0; j<scores.length; j++) {
//					System.out.println("scores: " + scores[0][1]);
//				}
//			}
			int[][] scores2 = new int[3][2]; 
			int[][] scores3 = new int[3][2];
			scores3[0] = new int[2];
			scores3[1] = new int[2];
			
			for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
					System.out.println("score["+ i +"] " + "score["+ j + "] "+ scores[i][j]);
			}
			System.out.println();
	}
//			scores[3][1] = 100;
//			System.out.println("scores[3][1]: "+ scores[3][1]);
		}
	}
