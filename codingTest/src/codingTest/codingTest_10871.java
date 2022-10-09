package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codingTest_10871 {
	
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    int A = Integer.parseInt(st.nextToken());
	    int B = Integer.parseInt(st.nextToken());
		int C;
	    
		st = new StringTokenizer(br.readLine());

		for(int i=1; i<=A; i++){
	    	C = Integer.parseInt(st.nextToken());
	        
	        
	        if(C < B) {
	        System.out.print(C+" ");
	        } else {
	    }
		}
	}
	}
