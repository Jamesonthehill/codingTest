package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_2439 {
	
	
	
	public static void main (String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int A = Integer.parseInt(br.readLine());

		for(int i=1; i<=A; i++) {
			for(int j=1; j<=A-i; j++) {
				System.out.print(" ");
			}
			for(int z=1; z<=i; z++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}