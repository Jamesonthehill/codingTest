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
		int z = 0; // �� ��° ���� ���ϴ� ��
		int L = 0; // �� ��° ���� ���ϴ� ��
		int[] arr = new int[L]; // �迭 ó��
		int max = 0; // �ִ밪 ���� ���� max
		int m = 0;  // �ִ밪�� ��° ��
		int A = 0; // ��
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