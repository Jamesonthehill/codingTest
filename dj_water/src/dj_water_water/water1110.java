package dj_water_water;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class water1110 {
	
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken()); // N���� �ֱ� ���� ���̴�.
		int origin = A;
		int Z = 0;
		// 1. ù°�ڸ� ��°�ڸ��� ���� �� �� �ִ� �޼��尡 �ʿ���
		
		while(true) {
			int B = A/10; // ���� �ڸ��� ���ϴ� ���̴�.
			int C = A%10; // ���� �ڸ��� ���ϴ� ���̴�.
			int D = C*10; // C*10 �Ͽ��� ���� �����ڸ��� ���ϴ� ���̴�.
			int E = (B+C); // �����ڸ��� �����ڸ��� ���ϱ� �Ͽ��� �� ��
			C = (E%10); // ���Ѱ����� �����ڸ��� ��
			A = (D+C); // ���� ����Ŭ���� �и��ؾ��� ��
			Z += 1; // ����Ŭ�� ���� ��

			if(origin == A) {
				break;
			}
		}
		System.out.println(Z);
	}
}