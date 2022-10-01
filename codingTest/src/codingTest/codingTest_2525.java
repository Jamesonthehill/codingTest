package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codingTest_2525 {
	
	
	
	public static void main (String[] args) throws IOException {
		
//		브론즈 3
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int c = Integer.parseInt(br.readLine());
	
		
		h = (60 * h) + m;
		h += c ;
		System.out.println((h/60%24)+" "+(h%60));
	
		
		
		
//		if(h>59) {
//			h++;
//			m = (c+m);
//		} else if (h>119) {
//				h++;
//				m = (c+m);
//		} else if (h>179) {
//			h++;
//			m = (c+m);
//		}
//			System.out.println(h+ " " + m);
//		
	}
}
