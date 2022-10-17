package dj_water_water;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class water10818 {
	
	public static void main (String[] args) throws Exception{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt(); // N 값이 입력 된다.
			int[] arr = new int[A];
			int max = 0;
			for(int i=0; i<A; i++) {
				arr[i] = sc.nextInt();
				
					if(arr[i] > max) {
						max = arr[i];
					}
			}
			sc.close();
			Arrays.sort(arr);
			System.out.println(arr[0] + " " + arr[A-1]);
		
	}
}