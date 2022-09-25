package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codingTest_3003 {
	
//	백준 코딩 킹, 퀸, 룩, 비숍, 나이트, 폰 문제 
	
	public static void main (String[] args) throws Exception {
		
//		Scanner in = new Scanner(System.in); 스캐너 버전
		
		
//		int 킹 = 1;
//		int 퀸 = 1;
//		int 룩 = 2;
//		int 비숍 = 2;
//		int 나이트 = 2;
//		int 폰 = 8;
//		
//		킹 = 킹 - in.nextInt();
//		퀸 = 퀸 - in.nextInt();
//		룩 = 룩 - in.nextInt();
//		비숍 = 비숍 - in.nextInt();
//		나이트 = 나이트 - in.nextInt();
//		폰 = 폰- in.nextInt();
//		
//		
//		
//		
//		System.out.print(킹 + " ");
//		System.out.print(퀸 + " ");
//		System.out.print(룩 + " ");
//		System.out.print(비숍 + " ");
//		System.out.print(나이트 + " ");
//		System.out.print(폰 + " ");
		
//		############################# 방법 2
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 버전
//		
//		int 킹 = 1;
//		int 퀸 = 1;
//		int 룩 = 2;
//		int 비숍 = 2;
//		int 나이트 = 2;
//		int 폰 = 8;
//		
//		StringTokenizer in = new StringTokenizer(br.readLine(), " ");
//		킹 = 킹 - Integer.parseInt(in.nextToken());
//		퀸 = 퀸 - Integer.parseInt(in.nextToken());
//		룩 = 룩 - Integer.parseInt(in.nextToken());
//		비숍 = 비숍 - Integer.parseInt(in.nextToken());
//		나이트 = 나이트 - Integer.parseInt(in.nextToken());
//		폰 = 폰 - Integer.parseInt(in.nextToken());
//		
//		
//		
//		
//		System.out.print(킹 + " ");
//		System.out.print(퀸 + " ");
//		System.out.print(룩 + " ");
//		System.out.print(비숍 + " ");
//		System.out.print(나이트 + " ");
//		System.out.print(폰 + " ");
//		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int king = 1;	
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		king = king - Integer.parseInt(st.nextToken());
		queen = queen - Integer.parseInt(st.nextToken());
		rook = rook - Integer.parseInt(st.nextToken());
		bishop = bishop - Integer.parseInt(st.nextToken());
		knight = knight - Integer.parseInt(st.nextToken());
		pawn = pawn - Integer.parseInt(st.nextToken());
 
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn + " ");		
		
		
	}
}