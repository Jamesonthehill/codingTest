package dj_water_water;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class water10951 {
	
	public static void main (String[] args) throws Exception{

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		
		
		String A = null;
		int B = 0;
		int C = 0;
		int D = 0;
		// ������ ������ ������ ���� �� �� ����ߵǴ°� ����
		while((A = br.readLine()) != null ) { // ���� �ٲ� (������ ��) ���� null�� �ƴϸ� ��� �ݺ� ��Ű�� �ƴϸ� �����.

			st = new StringTokenizer(A," ");
			
			B = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			D = (B+C);
			sb.append(D).append('\n');
		}
	
		System.out.print(sb);
	
	}
}
