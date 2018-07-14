package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	private Airfield airfield;
	
	public static void main(String[] args) {
		
		Jet[] jets = new Jet[15];
		Jet f22 = new FighterJet("F22", 1500, 1600, 150000000);
		Jet f16 = new FighterJet("F16", 915, 2280 , 18800000);
		Jet mig29 = new FighterJet("MIG-29", 1490, 888, 22000000);
		Jet airbus = new CargoPlane("Airbus", 518, 4000, 17500000);
		Jet b747 = new PassengerJet("Boeing 747", 614, 7740, 83000000);
		jets[0] = f22;
		jets[1] = f16;
		jets[2] = mig29;
		jets[3] = airbus;
		jets[4] = b747;
		
		Airfield af = new Airfield(jets);
		
		
		Scanner sc = new Scanner(System.in);
		String input;
		do {
			displayUserMenu();
			input = sc.nextLine();
			switch(input) {
			case "1":
				af.listFleet();
				break;
			case "2":
				af.launchAllJets();
				break;
			case "3":
				af.displayFastestJet();
				break;
			case "4":
				af.displayLongestRange();
				break;
			case "5":
				((PassengerJet) b747).loadPassengers();
				break;
			case "6":
				((CargoCarrier) airbus).loadCargo();
				break;
			case "7":
				Jet ji = new JetsImpl();
				for (int i = 0; i < jets.length; i++) {
					if (jets[i] == null) {
					jets[i] = ji;
					break;
					}
				}
				break;
			}
			
			
		} while ( !(input.equalsIgnoreCase("quit") || (input.equals("8"))));

		
		System.out.println("Goodbye.");
		sc.close();
	}
	
	public JetsApplication() {
		
	}
	
	public static void displayUserMenu() {
		System.out.println("Welcome to the Airfield!");
		System.out.println("Here is a list of options.");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly All Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View Jet With Longest Range");
		System.out.println("5. Load Passenger Planes");
		System.out.println("6. Load Cargo Planes");
		System.out.println("7. Add Jet to Fleet");
		System.out.println("8. Quit");
		System.out.print("Please enter an option: ");
	}
	
	public void launch() {
		airfield.launchAllJets();
	}

}
