//Food Trucks
//Overview
//Users will input and rate a list of food trucks, then view the average rating and the 
//highest-rated truck.
//
//Structure
//TODO You will define a FoodTruck class with fields for a unique numeric id, a name 
//("TacoRific", "Mediterranean Medic", etc.), food type ("Tacos", "Falafel", etc.), and a 
//numeric rating.
//
//TODO You will create a separate class with a main method that starts the program. It will 
//have an array to store up to five FoodTruck objects. The main method of this class is the 
//only static method in the entire project.
//
//User Stories
//User Story #1
//TODO The user is prompted to input the name, food type, and rating for up to five food trucks. 
//TODO For each set of input, a FoodTruck object is created, its fields set to the user's input, 
//and it is added to the array. The truck id is not input by the user, but instead assigned 
//automatically in the FoodTruck constructor from a static field that is incremented as each 
//truck is created.
//
//User Story #2
//TODO If the user inputs quit for the food truck name, input ends immediately and the program 
//continues.
//
//User Story #3
//TODO After input is complete, the user sees a menu from which they can choose to:
//
//TODO List all existing food trucks.
//TODO See the average rating of food trucks.
//TODO Display the highest-rated food truck.
//Quit the program.
//User Story #4
//TODO After choosing a menu item, the user sees the menu again and can choose another item until 
//the choose to quit.
//
//There are no static methods other than the one main method.
//When a FoodTruck is created, its constructor assigns its id field the current value of a 
//static field (such as (nextTruckId) and then increments the static field.
//The user can input up to five food trucks.
//The user can stop inputing trucks before entering five by entering quit as the truck name, 
//after which all input stops and the program continues.
//When a menu item is chosen the list of all trucks entered is displayed. If less than five 
//were input, only those trucks that were created are displayed.
//When another menu item is chosen the average rating based on the number of trucks entered 
//is displayed.
//When another menu item is chosen the winning truck - the one that was input with the highest 
//rating - is displayed with all its properties.
//Food trucks are displayed by printing its toString, which includes all FoodTruck fields.
//When the quit menu item is chosen, the program ends with a message.

package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private int truckRating;
	private int ID;

	
	

public FoodTruck() {
		super();
	}
public FoodTruck(String truckName, String foodType, int truckRating, int iD) {
		super();
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
		ID = iD;
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
		ID = iD;
	}
	// testing information
	public String getFoodTruckData() {
		String output = "\ntruckID: " + ID + "\ntruckName: " + truckName + "\nfoodType: " + foodType + "\ntruckRating: " + truckRating;
		return output;
	}
	public void displayFoodTruck() {
		String ftData = getFoodTruckData();
		System.out.println(ftData);
	}
	public void Menu() {
		System.out.println("Press 1 for food truck list");
		System.out.println("Press 2 for rating");
		System.out.println("Type Quit to quit");
	}
	
}
