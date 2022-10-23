package codingTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codingTest_1546 {
    
    public static void main(String[] args) throws IOException {
        
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	
    	double A = Double.parseDouble(br.readLine());
    	double[] arr = new double[(int) A];
    	double B;
    	double max = 0;
    	double sum = 0;
    	double avg = 0;

    	StringTokenizer st = new StringTokenizer(br.readLine());
	    	for(int i=0; i<A; i++) {
	    		B = Double.parseDouble(st.nextToken());
	    		arr[i] = B;
	    		
	    		if(arr[i] >= max) {
	    			max = arr[i];
	    		}
	    	}
	    	
	    	for(int x=0; x<A; x++) {
	    		Double[] brr = new Double[(int)A];
	    		
				brr[x] = arr[x]*100/max;
				
				sum += brr[x];
			}
	    	
	    	avg = sum/A;
	    	System.out.println(avg);	
	    	br.close();
    
    }
}

