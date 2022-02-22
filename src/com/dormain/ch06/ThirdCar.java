package com.dormain.ch06;

public class ThirdCar {
	String company ="람보르기니";
	String model = "우라칸" ;
	String color = "Red";
	int maxSpeed = 100;
	
		public ThirdCar() {
			
		}
		public ThirdCar(String model) {
			this(model, null, 0);
		}
		public ThirdCar(String model, String color) {
			this(model, color, 0);
		}
		public ThirdCar(String model, String color, int maxSpeed) {
				this.model = model;
				this.color = color;
			 	this.maxSpeed = maxSpeed;
		}
	}