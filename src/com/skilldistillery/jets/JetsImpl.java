package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsImpl extends Jet {
	
	public JetsImpl() {
		Scanner sc = new Scanner(System.in);
		System.out.print("To enter a new jet, please begin by entering the name: ");
		String model = sc.nextLine();
		this.setModel(model);
		System.out.print("How fast does this jet fly in MPH: ");
		double speed = sc.nextDouble();
		this.setSpeed(speed);
		System.out.print("What is the range of the jet in miles: ");
		double range = sc.nextDouble();
		this.setRange((int)range);
		System.out.print("What is the price of the jet: ");
		double price = sc.nextDouble();
		this.setPrice((long)price);
		this.setHours(range/speed);
	}

	public JetsImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
}
