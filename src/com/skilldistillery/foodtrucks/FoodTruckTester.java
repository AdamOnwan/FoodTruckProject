package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckTester {

	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);

		String Name, Type;
		int Rating, i, ID;
		FoodTruck ftArray[] = new FoodTruck[5];		
		
		for (i = 0; i < 2; i++) {
		ID = i;
		System.out.println("Truck ID: " + ID);
		System.out.println("Enter Name");
		Name = kb.next();
		System.out.println("Enter Type");
		Type = kb.next();
		System.out.println("Enter Rating 1(lowest) to 10 (highest)");
		Rating = kb.nextInt();
		while (Rating > 10){	
				System.out.println("Error, enter a whole number 1 being lowest and 10 being highest rated");
				Rating = kb.nextInt();
		}
		System.out.println(Name + Type + Rating + ID);
		
//		ft[i]. = Name;
//		ft[i].foodType = Type;
//		ft[i].truckRating = Rating;
//		ft[i].ID = ID;
		}
		
		ftArray.displayFoodTruck();
		
		String ft1Data = ftArray[1].getFoodTruckData();
		
		System.out.println("Food Truck 1 data: " + ft1Data);
		
		ftArray[i].Menu();
		
		
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
