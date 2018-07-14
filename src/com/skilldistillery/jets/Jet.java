package com.skilldistillery.jets;

public abstract class Jet {
	String model = "";
	double speed = 0;
	int range = 0;
	long price = (long) 0.0;
	
	public Jet(String model, double speed, int range, long price) {
		
	}
	
	void fly() {
		
	}
	
	public double getSpeedInMach() {
		double speedInMach = this.speed * .00130332;
		return speedInMach;
	}
}
