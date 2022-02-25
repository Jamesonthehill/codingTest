package com.dormain.ch06;

public class Earth {

	static final double EARTH_RADIUS = 1.0;
	static final double EARTH_SURFACE_AREA = 3.0;
			
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
