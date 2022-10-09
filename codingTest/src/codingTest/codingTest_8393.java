package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codingTest_8393 {
	
	
	
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), "");
		
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(st.nextToken());
		
		int sum = 0; // 사용 할 값에 null 이나 0을 넣어두는 습관은 좋은 습관임.

		for(int i=1; i<=A; i++) { // 1~A 값까지 반복 시키겠다고 선언
			
			sum += i; // sum 값은 i 값을 더할것이다.
			
		}
		sb.append(sum);
		System.out.println(sb); // 더한 sum 값을 출력 하여라
//		int c = b;
	}
}