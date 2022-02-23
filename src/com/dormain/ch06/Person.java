package com.dormain.ch06;

public class Person {
	final String nation = "대한민국"; //선언동시 초기화 , final사용은 중간에 바꿀수없음
	final String ssn;
	String name;
	
	public Person(String ssn, String name) { //생성자를 이용한 초기화
		this.ssn = ssn;
		this.name = name;
	}
	
}
