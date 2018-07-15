package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	private Airfield airfield;

	public static void main(String[] args) {

		displayUserMenu();

	}

	public JetsApplication() {

	}

	public static void displayUserMenu() {
		Jet[] jets = new Jet[15];
		Jet f22 = new FighterJet("F22", 1500, 1600, 150000000);
		Jet f16 = new FighterJet("F16", 915, 2280, 18800000);
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
			System.out.println("Welcome to the Airfield!");
			System.out.println("Here is a list of options.");
			System.out.println("1. List Fleet");
			System.out.println("2. Launch All Jets");
			System.out.println("3. View Fastest Jet");
			System.out.println("4. View Jet With Longest Range");
			System.out.println("5. Load Passenger and Cargo Planes");
			System.out.println("6. Send Fighter Jets Out");
			System.out.println("7. Add Jet to Fleet");
			System.out.println("8. Dogfight!");
			System.out.println("9. Quit");
			System.out.print("Please enter an option: ");

			input = sc.nextLine();
			switch (input) {
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
				((CargoCarrier) airbus).loadCargo();
				break;
			case "6":
				((FighterJet) f22).fight();
				((FighterJet) f16).fight();
				((FighterJet) mig29).fight();
				System.out.println();
				break;
			case "7":
				Jet jet = addNewJet();
				addJet(jet, jets);
				break;
			case "8":
				System.out.println(
						"Before the planes are able to take off, a missle comes in and destroys the entire airport.");
				System.out.println("Please wait while the airport is rebuilt...\n\t...\n...\t\t...");
				break;
			}
		} while (!(input.equalsIgnoreCase("quit") || (input.equals("9"))));

		System.out.println("Goodbye.");
		sc.close();
	}

	public void launch() {
		airfield.launchAllJets();
	}

	public static Jet addNewJet() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to add a Fighter, Passenger, or Cargo Jet: ");
		String newJet = sc.nextLine();

		System.out.print("To enter a new jet, please begin by entering the name: ");
		String model = sc.nextLine();
		System.out.print("How fast does this jet fly in MPH: ");
		double speed = sc.nextDouble();
		System.out.print("What is the range of the jet in miles: ");
		double range = sc.nextDouble();
		System.out.print("What is the price of the jet: ");
		double price = sc.nextDouble();
		long price1 = (long) price;
		int range1 = (int) range;

		if (newJet.equalsIgnoreCase("fighter")) {
			JetsImpl fj = new JetsImpl(model, speed, range1, price1);
			return fj;
		}
		else if (newJet.equalsIgnoreCase("passenger")) {
			PassengerJet pj = new PassengerJet(model, speed, range1, price1);
			return pj;
		}
		else if (newJet.equalsIgnoreCase("cargo")) {
			CargoPlane cp = new CargoPlane(model, speed, range1, price1);
			return cp;
		}
		else {
			Jet ji = new JetsImpl(model, speed, range1, price1);
			return ji;
		}
	}

	public static Jet[] addJet(Jet jet, Jet[] jetList) {
		for (int i = 0; i < jetList.length; i++) {
			if (jetList[i] == null) {
				jetList[i] = jet;
				break;
			}
		}
		return jetList;
	}
}
