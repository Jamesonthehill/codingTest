package codingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_5597 {
    
    public static void main(String[] args) throws IOException { // Null 예외 처리
        
    	Scanner in = new Scanner(System.in); // 스캐너 처리
    	
    	int[] arr = new int[31]; // 배열 31개 자리까지
    	
    	int A; // 변수 A 선언
    	
    	for(int i=1; i<29; i++) { // i가 29 전까지 반복 
    		A = in.nextInt(); //  A을 값 받음
    		arr[A] = 1;  // arr[낸사람번호] = 1 로 함
    	}
    	
    	for(int i=1; i<arr.length; i++) { // i 가 arr[낸사람 수] 만큼 반복함
    		if(arr[i] != 1) { // 만약 arr[낸사람이 번호가] = 1 아니면 안낸사람임
    			System.out.println(i); // 안냈을 때 번호를 출력함
    		}
    	}
    	in.close(); // 스캐너 종료
    	
    }
}

