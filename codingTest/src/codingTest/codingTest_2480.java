package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_2480 {
	
	
	
	public static void main (String[] args) throws IOException {
		
		// 주사위 세 개
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if( a == b && b == c && a == c) {
			System.out.println(10000+(a*1000));
		} else if (a == b ) {
			System.out.println(1000+(a*100));
		}	else if ( b == c) {
				System.out.println(1000+(b*100));
		}		else if ( a == c ) {
					System.out.println(1000+(c*100));
		}
		
		
		else {
				
			int result = (a > b ) ? a : b;
			int result2 = ( result > c ) ? result : c ;
				System.out.println(result2*100);
			}
			
		}
		
	}
