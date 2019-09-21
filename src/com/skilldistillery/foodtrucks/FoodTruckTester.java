package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckTester {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);

		String truckName, foodType;
		int truckRating, i, iD = 0;
		FoodTruck ftArray[] = new FoodTruck[5];		
		
		for (i = 0; i < 3; i++) {
		ftArray[i] = new FoodTruck();
		iD++;
		ftArray[i].setID(iD);
		System.out.println("Truck ID: " + iD);
		System.out.println("Enter Name");
		truckName = kb.next();
		ftArray[i].setTruckName(truckName);
		System.out.println("Enter Type");
		foodType = kb.next();
		ftArray[i].setFoodType(foodType);
		System.out.println("Enter Rating 1(lowest) to 10 (highest)");
		truckRating = kb.nextInt();
		ftArray[i].setTruckRating(truckRating);
		while (truckRating > 10){	
				System.out.println("Error, enter a whole number 1 being lowest and 10 being highest rated");
				truckRating = kb.nextInt();
		}
		System.out.println("i is " + i);
		System.out.println("ID is " + iD);
		System.out.println(truckName + foodType + truckRating + iD);
		
		}
		
		ftArray[0].displayFoodTruck();
		ftArray[1].displayFoodTruck();
		ftArray[2].displayFoodTruck();
		
//		String ft1Data = ftArray[0].getFoodTruckData();
		
//		System.out.println("Food Truck 1 data: " + ft1Data);
		
//		ftArray[i].Menu();
		
		
//		public void Menu() {
//			System.out.println("Press 1 for food truck list");
//			System.out.println("Press 2 for rating");
//			System.out.println("Type Quit to quit");
//		}
//			return menu;
		
//		String foodTruckMenu = kb.next();
//		switch foodTruckMenu {
//		case "1": 
//		case "2":
//		case "3":
//		case "4":
//		case "5":
//			
//		}
//		public String getMenu() {
//			System.out.println("Welcome");
//			System.out.println("Press 1 to view food truck");
//				System.out.println("press 1 to input name of food truck");
//					System.out.println("enter food truck name or type quit to leave menu");
//				System.out.println("press 2 to go back to main menu");
//			System.out.println("Press 2 to choose food type");
//			System.out.println("Press 3 to rate food truck");
//		}
//	}

	}
}
