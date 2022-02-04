package com.dormain.ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			int v1 = 15;
			
			if(v1	>	10) {
				int v2;
				v2 = v1 - 10;
				int v3 = v1 + v2 + 5; // v2 변수를 아용 할수 없기 때문에 컴파일 애러뜬다.
			}
			
	
	}
	

}
