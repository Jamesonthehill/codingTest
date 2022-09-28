package codingTest;

import java.util.Scanner;

public class codingTest_2884 {
	
	
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int h = in.nextInt();
		int m = in.nextInt();
		in.close();
		 
		if(m<45) {
			h--;
			m = 60 + (m - 45);
			
			if ( h < 0 ) {
				h = 23;
				
			}
				System.out.println(h+" "+m);
			}  
			
				else if(m>=45)  {
				m -= 45;
				System.out.println(h+" "+m);
			}
	}
}
