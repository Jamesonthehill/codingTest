package codingTest;

import java.util.Scanner;

public class codingTest_10171 {
	
	
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a>b) {
			System.out.println(">");
		} else if(a==b) {
			System.out.println("==");
		} else {
			System.out.println("<");
		}
	}
}