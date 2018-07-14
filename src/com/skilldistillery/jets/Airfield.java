package com.skilldistillery.jets;

public class Airfield {

	private Jet[] jets = new Jet[15];

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}
	
	public Airfield(Jet[] jets) {
		this.jets = jets;
	}
	
	public void listFleet() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			}
			System.out.println("Jet " + (i + 1) + ": " + jets[i].model + ", Speed: " + jets[i].speed + "MPH, Range: " 
					+ jets[i].range + " miles, Price: $" + jets[i].price);
		}
		System.out.println();
	}
	
	public void launchAllJets() {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			}
			jets[i].fly();
		}
	}
	
	public void displayFastestJet() {
		Jet tempJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			}
			if (jets[i].speed > tempJet.speed) {
				tempJet = jets[i];
			}
		}
		System.out.println(tempJet);
		System.out.println();
	}
	public void displayLongestRange() {
		Jet tempJet = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				break;
			}
			if (jets[i].range > tempJet.range) {
				tempJet = jets[i];
			}
		}
		System.out.println(tempJet);
		System.out.println();
	}
}
