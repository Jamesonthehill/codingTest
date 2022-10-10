package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_10952 {
	
	
	
	public static void main (String[] args) throws Exception {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();

		int A = 1;
		int B = 1;
		int C = 0;
		if(A != 0 && B != 0) {
			while(A != 0 || B != 0) {
				st = new StringTokenizer(br.readLine());
			
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				C = (A+B);
				if (C == 0 ? true : false ) {
					break;
				}
				sb.append(C);
				sb.append("\n");
			} 
		} 
		System.out.println(sb);
 	}
		
}
