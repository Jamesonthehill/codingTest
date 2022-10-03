package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codingTest_10950 {
	
	
	
	public static void main (String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< T; i++) { // 이 반복문이 처음 적은 숫자 만큼 반복해주는 역할이네.
			st = new StringTokenizer(br.readLine(), " ", false);// 데이터가 들어왔을 때 공백일 시 구분x
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())); // sb에 값 + 값 호출
			sb.append('\n'); // 개행
			
		}
		System.out.println(sb); // 출력하셈
	}
}

