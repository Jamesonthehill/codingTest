package dj_water_water;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class water25304 {
	
	public static void main (String[] args) throws Exception{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	StringTokenizer st;

	int A = Integer.parseInt(br.readLine());
	int B = Integer.parseInt(br.readLine());
	int C;
	int F = 0;
	for(int i=0; i<B; i++) {
		st = new StringTokenizer(br.readLine());
		C = (Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken()));
		F += C;
	}
	System.out.println(F);
	if(A==F) {
		System.out.println("Yes");
	}	else {
		System.out.println("No");
	}
	}
}