package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private int truckRating;
	private int ID = 0;
	private static int nextID = 1;
	private FoodTruck ftArray[] = new FoodTruck[5];
	private int counter;

	public void truckInput(Scanner kb) {
		String truckName, foodType;
		int truckRating, i;

		for (i = 0; i < ftArray.length; i++) {
			System.out.println("Enter Truck Name:");
			truckName = kb.next();
			if (truckName.equalsIgnoreCase("quit")) {
				break;
			}
			ftArray[i] = new FoodTruck();
			ftArray[i].setTruckName(truckName);
			System.out.println("Enter Truck Type:");
			foodType = kb.next();
			ftArray[i].setFoodType(foodType);
			System.out.println("Enter Truck Rating 1(lowest) to 10 (highest)");
			truckRating = kb.nextInt();
			ftArray[i].setTruckRating(truckRating);
			while (truckRating > 10) {
				System.out.println("Error, enter a whole number 1 being lowest and 10 being highest rated");
				truckRating = kb.nextInt();
			}
			ftArray[i].setID(i);
			counter++;
		}
	}

	private void truckRating() {
		int output = 0;
		for (int i = 0; i < counter; i++) {
			if (i < counter) {
				output = output + ftArray[i].truckRating;
			}
		}
		double average;
		average = ((double) output / counter);
		System.out.print("Average rating is: ");
		System.out.printf("%.2f", average);
		System.out.println();
	}

	private void highRating() {
		FoodTruck maxTruck = ftArray[0];

		for (int i = 0; i < counter; i++) {
			if (maxTruck.truckRating < ftArray[i].truckRating) {
				maxTruck = ftArray[i];
			}
		}
		System.out.println(maxTruck);
	}

	public void truckMenu(Scanner kb) {
		boolean keepGoing = true;
		do {

			System.out.println("(1) List all existing food trucks");
			System.out.println("(2) See the average rating of food trucks");
			System.out.println("(3) Display the highest-rated food truck");
			System.out.println("(4) Quit the program");
			String switchmenu = kb.next();
			switch (switchmenu) {
			case "1":
				for (int i = 0; i < ftArray.length; i++) {
					if (ftArray[i] == null) {
						continue;
					} else
						System.out.println(ftArray[i].toString());
				}

				break;
			case "2":
				truckRating();
				break;
			case "3":
				highRating();
				break;
			case "4":
				keepGoing = false;
				System.out.println("Goodbye, have a nice day");
			}
		} while (keepGoing == true);
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = nextID;
		nextID++;
	}

	public FoodTruck[] getFtArray() {
		return ftArray;
	}

	public void setFtArray(FoodTruck[] ftArray) {
		this.ftArray = ftArray;
	}

	public FoodTruck(String truckName, String foodType, int truckRating, FoodTruck[] ftArray) {
		super();
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		this.ID = nextID;
	}

	public FoodTruck() {
		super();
	}

	@Override
	public String toString() {
		return "FoodTruck [truckName=" + truckName + ", foodType=" + foodType + ", truckRating=" + truckRating + ", ID="
				+ ID;
	}

}
