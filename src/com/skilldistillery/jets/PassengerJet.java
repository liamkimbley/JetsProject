package com.skilldistillery.jets;

public class PassengerJet extends Jet implements Passenger {

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadPassengers() {
		System.out.println("Loading Passengers...\n...\nAll Passengers Loaded.");
	}
}
