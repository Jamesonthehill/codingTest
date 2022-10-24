package codingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_10807 {
    
    public static void main(String[] args) throws IOException { // Null 예외 처리
        
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 선언
    		
    		int A = Integer.parseInt(br.readLine()); // 몇개인지 받을 변수 A 선언
    		int B; // 변수 B 는 가로로 받을 값 변수 선언
    		int Z = 0; // Z 는 일치하는 값이 몇개인지 구하는 변수 선언
    		int[] arr = new int[A]; // 배열 arr는 A의 갯수 만큼 있음
    		StringTokenizer st = new StringTokenizer(br.readLine()); // 토큰 사용 선언

    		for(int i=0; i<A; i++) { // A전까지 반복문 돌릴것
    			B = Integer.parseInt(st.nextToken()); // B값을 계속 받음 i<A 일때까지
    			arr[i] = B; // arr[0~10] 은 B의 값으로 순서대로 대입
    		}
    		int C = Integer.parseInt(br.readLine()); // 같은 값을 찾게하는 변수 C 선언
    		for(int x=0; x<A; x++) { // 반복문 x<A보다 작을때 즉, arr[0~10] 다 검사하겟다는 것임
    			if(arr[x] == C) { // 만약 arr[x] 가 c 와 같다면?
    				Z++; // Z에 +1씩 하라
    			}
    		}
    		System.out.println(Z); // Z출력 같은 값의 갯수임
    		br.close(); // 버퍼 종료
    }
}

