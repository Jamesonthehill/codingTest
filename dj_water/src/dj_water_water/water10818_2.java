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
			
			int A = Integer.parseInt(st.nextToken()); // N ���� �Է� �ȴ�.
			int[] arr = new int[A]; // �迭 arr�ȿ� A��� ���� ��� ���Խ�ų���� A�� 5�� �迭 5�ϱ�  0,1,2,3,4 ��, 5�� ���� �� ����
				
			while(true) {
				st = new StringTokenizer(br.readLine()); // while���� �������� ���� �� �� �ٲ� but �ѹ��� �۵� �ϵ��� break; �� �س���
				if(st.hasMoreTokens()) { // Token�ȿ� �ƹ��͵� ������ ���߰�, ���� ������ ��� �۵���
					for(int i=0; i<A; i++) { // �ݺ��� ����
					
						arr[i] = Integer.parseInt(st.nextToken()); // ����ؼ� �Է¹��� ���η�
					}
					br.close(); // ���� ����
					Arrays.sort(arr); // ������������ ����
					System.out.println(arr[0] + " " + arr[A-1]); // ù��° ���� �ּ� , ������ ���� �ִ���
					break; // �ݺ��� �ߴ�
				}
			}

		
	}
}