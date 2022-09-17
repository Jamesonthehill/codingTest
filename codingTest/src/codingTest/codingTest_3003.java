package codingTest;

import java.util.Scanner;

public class codingTest_3003 {
	
//	백준 코딩 킹, 퀸, 룩, 비숍, 나이트, 폰 문제 
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int 킹 = 1;
		int 퀸 = 1;
		int 룩 = 2;
		int 비숍 = 2;
		int 나이트 = 2;
		int 폰 = 8;
		
		킹 = 킹 - in.nextInt();
		퀸 = 퀸 - in.nextInt();
		룩 = 룩 - in.nextInt();
		비숍 = 비숍 - in.nextInt();
		나이트 = 나이트 - in.nextInt();
		폰 = 폰- in.nextInt();
		
		
		
		
		System.out.print(킹 + " ");
		System.out.print(퀸 + " ");
		System.out.print(룩 + " ");
		System.out.print(비숍 + " ");
		System.out.print(나이트 + " ");
		System.out.print(폰 + " ");
		
		
		
	}
}