package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_2739 {
	
	
	
	public static void main (String[] args) throws IOException {
		
		// 구구단
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "");
		
		int a = Integer.parseInt(st.nextToken());
		
			System.out.println(a+" * "+"1 "+"= "+(a*1));
			System.out.println(a+" * "+"2 "+"= "+(a*2));
			System.out.println(a+" * "+"3 "+"= "+(a*3));
			System.out.println(a+" * "+"4 "+"= "+(a*4));
			System.out.println(a+" * "+"5 "+"= "+(a*5));
			System.out.println(a+" * "+"6 "+"= "+(a*6));
			System.out.println(a+" * "+"7 "+"= "+(a*7));
			System.out.println(a+" * "+"8 "+"= "+(a*8));
			System.out.println(a+" * "+"9 "+"= "+(a*9));
	}
}