package com.dormain.ch07;

public class MyFriendDetailInfo extends MyFriendInfoNum {
	
	public static void main(String[] args) {
		
		MyFriendInfoNum myFriendInfo = new MyFriendInfoNum();
		
		myFriendInfo.printAddress();
		myFriendInfo.printNumber();
		myFriendInfo.printNumber();
		myFriendInfo.printNumber();
		
		System.out.println(myFriendInfo.getAddress());
		System.out.println(myFriendInfo.getNumber());
	}
}
