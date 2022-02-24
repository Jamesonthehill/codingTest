package com.dormain.ch07;

public class MyFriendInfoNum extends MyFriendInfo{

	private String Number = "Number";

	public void printNumber() {
		System.out.println("010-2247-8714");
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String Number) {
		this.Number = Number;	
}
}
