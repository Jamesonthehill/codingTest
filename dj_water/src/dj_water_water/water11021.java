package dj_water_water;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class water11021 {
	
	public static void main (String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		int A = Integer.parseInt(br.readLine());
		int C = 1;
		int D = 0;
		int F = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<A; i++) {
			st = new StringTokenizer(br.readLine());
			
			D =	Integer.parseInt(st.nextToken());
			F = Integer.parseInt(st.nextToken());
			
			sb.append("Case #" + C++ + ": ");
			
			sb.append(D + " + " + F + " = " + (D+F));
		
			sb.append('\n');
		}
		System.out.println(sb);
		br.close();
	}
}
