package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	private Airfield airfield;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		displayUserMenu();
		String input = sc.nextLine();
		
		
		
		
		
		
		
		
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
		
	}

}
