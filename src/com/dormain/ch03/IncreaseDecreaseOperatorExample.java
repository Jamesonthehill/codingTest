package com.dormain.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;
		
		
		
		
		
		System.out.println("-----------------------");
		
		x++; 
		++x;
		
		// System.out.println(x++);
				// System.out.println(x);
				// System.out.println(++x);
		
		System.out.println("x: " + x);	// 12
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y: " + y); // 8
		
		System.out.println("-----------------------");
		
		z = x++;
		System.out.println("z: "+ z); //12
		System.out.println("x: "+ x);	//	13
		
		System.out.println("-----------------------");
		z = ++x + y++;
		System.out.println("z: "+ z);	// 24
		System.out.println("x: "+ x);	// 14
		System.out.println("y: "+ y);	// 9
		
		
		
		
		
		
		
		
		
		
		
	}

}
