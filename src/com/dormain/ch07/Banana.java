package com.dormain.ch07;

public class Banana extends Apple{
	
		private String strBanana ="strBanana";

		public void printBanana() {
			System.out.println("Banana");
		}
		public String getStrBanana() {
			return strBanana;
		}
		public void setStrBanana(String strBanana) {
			this.strBanana = strBanana;
		}
}
