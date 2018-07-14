package com.skilldistillery.jets;

public abstract class Jet {
	String model = "";
	double speed = 0;
	int range = 0;
	long price = (long) 0.0;
	double hours;
	
	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public Jet() {
	
	}
	
	public Jet(double speed) {
		this.speed = speed;
	}
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.hours = range/speed;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet Name: " + model + "\nSpeed: " + speed + "MPH\nRange: " + range + " miles\nPrice: $" + price 
				+ "\nHours of Flight: " + this.hours;
	}

	void fly() {
			System.out.println(this.model + " takes off.\nIt is able to fly for a range of " + this.range + " miles, or " 
					+ this.hours + " hours.");
	}
	
	public double getSpeedInMach() {
		double speedInMach = this.speed * .00130332;
		return speedInMach;
	}
}
