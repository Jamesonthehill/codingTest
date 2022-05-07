
package codingtest;

		class A{
			A(String s){
				this.s = s + "A";
			}
			public fn(String s) {
				System.out.println(this.s + s);
			}
			
			class B extends A {
				private String s;
				B(String s){
					this.s = s + "B";
				}
				public fn(String s) {
					System.out.println(this.s + s);
				}
			}
			public static void main(String[] args) {
				A a = new B("Hello");
				a.fn("Hi");
			} 
		
}