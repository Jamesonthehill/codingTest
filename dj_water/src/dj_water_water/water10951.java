package dj_water_water;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class water10951 {
	
	public static void main (String[] args) throws Exception{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		
		
		String A = null;
		int B = 0;
		int C = 0;
		int D = 0;
		// 문제의 요지는 공백을 앤터 할 때 멈춰야되는것 같음
		while((A = br.readLine()) != null ) { // 줄이 바뀔때 (개행할 때) 값이 null이 아니면 계속 반복 시키고 아니면 멈춰라.

			st = new StringTokenizer(A," ");
			
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			D = (B+C);
			sb.append(D).append('\n');
		}
	
		System.out.print(sb);
	
	}
}
