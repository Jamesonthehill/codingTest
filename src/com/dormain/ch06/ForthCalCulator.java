package com.dormain.ch06;

public class ForthCalCulator { // 클래스에는 static 쓰지못함

	static double pi = 3.14159; 
	
	static int plus(int x ,int y) { // static은 객체만 있어도 에러안뜨게함
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}

}
