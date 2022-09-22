package codingTest;

import java.util.Scanner;

public class codingTest_2588 {
	
	
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		String y = in.next();

		in.close();
		
		System.out.println(x*(y.charAt(2) - '0'));
		System.out.println(x*(y.charAt(1) - '0'));
		System.out.println(x*(y.charAt(0) - '0'));
		System.out.println(x * Integer.parseInt(y));
	}
}