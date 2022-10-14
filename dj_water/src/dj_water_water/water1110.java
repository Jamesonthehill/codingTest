package dj_water_water;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class water1110 {
	
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); // N값을 넣기 위한 행이다.
		int origin = A;
		int Z = 0;
		// 1. 첫째자리 둘째자리를 구분 할 수 있는 메서드가 필요함
		
		while(true) {
			int B = A/10; // 십의 자리를 구하는 행이다.
			int C = A%10; // 일의 자리를 구하는 행이다.
			int D = C*10; // C*10 하여서 다음 십의자리를 구하는 행이다.
			int E = (B+C); // 십의자리와 일의자리를 더하기 하였을 때 값
			C = (E%10); // 더한값에서 일의자리의 값
			A = (D+C); // 다음 사이클에서 분리해야할 값
			Z += 1; // 사이클이 도는 값

			if(origin == A) {
				break;
			}
		}
		System.out.println(Z);
	}
}