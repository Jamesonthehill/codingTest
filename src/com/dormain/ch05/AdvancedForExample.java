package com.dormain.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			int[] scores = {95, 71, 84, 93, 87};
				for(int i=0; i <scores.length; i++) {
						System.out.println(scores[i]);
				}
				int a = 0;
				int i = 0;
				for(int score : scores) {
					
					System.out.println( a + "score: " + score);
					System.out.println( a + "scores: " + scores[i]);
					a++;
					System.out.println();
				}
	}
}
