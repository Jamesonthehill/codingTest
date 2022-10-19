package dj_water_water;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class water2562 {
	
	public static void main (String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		Scanner sc = new Scanner(System.in);
		
		String F;
		int z = 0; // 몇 번째 인지 구하는 행
		int L = 0; // 몇 번째 인지 구하는 행
		int[] arr = new int[L]; // 배열 처리
		int max = 0; // 최대값 변수 선언 max
		int m = 0;  // 최대값의 번째 수
		int A = 0; // 값
			while(true){
				int i = 0;
				while((F = br.readLine()) != null) {
					
				L++;
				arr = new int[L];
				st = new StringTokenizer(F, " ");
				A = Integer.parseInt(st.nextToken());
				arr[i] = A;
				z++;
					if(arr[i] > max) {
						max = arr[i];
						m = z;
					}
				}
				br.close();
				System.out.println(max+" "+m);
				break;
		}
	}
}