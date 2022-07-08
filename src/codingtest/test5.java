
package codingtest;

class SuperObj {
	public void show() {
		print();
	}
	public void print() {
		print();
		System.out.println("Super");  
	}
}

class SubObj extends SuperObj {
	public void show() { 
		super.print();   
	} 
	public void print() {
		System.out.print("Sub");  
	} 
} 

public class Soojebi { 
	public static void main(String[] args) {
		SuperObj s = new SubObj();
		s.show();
	}
} 