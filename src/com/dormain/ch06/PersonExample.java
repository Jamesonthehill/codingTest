package com.dormain.ch06;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("121122-9321811" , "김동만");
		
		System.out.println(person.nation);
		System.out.println(person.name);
		System.out.println(person.ssn);
		
		person.name = "고소영";
	}

}
