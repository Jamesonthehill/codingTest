package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class codingTest_3052 {
	
	public static void main (String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // 버퍼 선언
		
			int A = 10; // A 값 10으로 선언
			int[] arr = new int[A]; // 배열에 10개의 값이 들어감
			int B; // 변수 B 선언
			int Z = 10; // Z는 나머지 값을 의미하는 변수임
			
			for(int i = 0; i < 10 ; i++ ) { // 10번 반복 시킬 것임
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				B = Integer.parseInt(st.nextToken()); // B 값을 10번 받게 될 거임
				
				arr[i] = B%42; // 배열안에 0~10까지 B%42한 나머지 값을 집어넣음
				
				} // 배열안에 값을 넣어주는 반복문은 여기까지
			
				for(int x=0; x<A; x++) { // 나머지 값을 구해주는 반복문 시작
					int y = 0; // y를 다시 0으로 해줄 것임
					for(y=0; y<x; y++) { // y 는 x보다 작으며 1씩 증가 시킴
						if(arr[x] == arr[y]) { // 만약 예를들어 arr[3]이랑 arr[0, 1, 2] 값 중에 같은게 있다면?
							Z--; // Z는 1씩 작아질 것임
							break; // 그리고 if문은 멈추고 다시 최상위 for문으로 돌아감
						} 
					}
				}
				System.out.println(Z); // Z는 서로다른 나머지 변수 호출하셈
	}
}