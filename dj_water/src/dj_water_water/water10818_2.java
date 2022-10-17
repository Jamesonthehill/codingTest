package dj_water_water;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class water10818_2 {
	
	public static void main (String[] args) throws IOException{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken()); // N 값이 입력 된다.
			int[] arr = new int[A]; // 배열 arr안에 A라는 값을 계속 주입시킬것임 A가 5면 배열 5니까  0,1,2,3,4 즉, 5개 넣을 수 있음
				
			while(true) {
				st = new StringTokenizer(br.readLine()); // while문이 돌때마다 한줄 씩 줄 바꿈 but 한번만 작동 하도록 break; 문 해놨음
				if(st.hasMoreTokens()) { // Token안에 아무것도 없으면 멈추고, 뭔가 있으면 계속 작동함
					for(int i=0; i<A; i++) { // 반복문 실행
					
						arr[i] = Integer.parseInt(st.nextToken()); // 계속해서 입력받음 가로로
					}
					br.close(); // 버퍼 종료
					Arrays.sort(arr); // 오름차순으로 정렬
					System.out.println(arr[0] + " " + arr[A-1]); // 첫번째 값이 최소 , 마지막 값이 최대임
					break; // 반복문 중단
				}
			}

		
	}
}