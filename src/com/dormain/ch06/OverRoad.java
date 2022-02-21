package com.dormain.ch06;

public class OverRoad {

		
		String company ="람보르기니";
		String model = "우라칸" ;
		String color = "Red";
		int maxSpeed = 100;
		
		public OverRoad() {
			
		}
		public OverRoad(String model) {
			this.model = model;
		}
		public OverRoad(String model, String color) {
			this.model = model;
			this.color = color;
		}
		public OverRoad(String model, String color, int maxSpeed) {
				this.model = model;
				this.color = color;
			 	this.maxSpeed = maxSpeed;
		}
}
