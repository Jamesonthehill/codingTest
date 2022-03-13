package com.dormain.ch07;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
	
	Calculator calculator = new Calculator();
		
	System.out.println("원면적: "+ calculator.areaCircle(2));
	calculator.areaCircle(1.0);
	
	Computer computer = new Computer();
	System.out.println("원면적: " + computer.areaCircle(2));
}
}
