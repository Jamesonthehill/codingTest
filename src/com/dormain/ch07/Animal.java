package com.dormain.ch07;

public abstract class Animal {
	
	public String kind;
	
	// 생성자
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();
	
	
}
