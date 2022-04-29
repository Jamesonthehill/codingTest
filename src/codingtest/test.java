
package codingtest;

public class test {
	public static void main(String[] args) {

			int  s= 0;
			int i ;
			
			for (i=1; i<=10; i++) {
				if ( i == 2)
					continue;
				else if(i==4)
					break;
				s += i;
			}
			System.out.println("i값: " + i);
			System.out.println("s값: " + s);
	}
}