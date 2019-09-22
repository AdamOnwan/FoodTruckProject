package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckTester {

	public static void main(String[] args) {

		FoodTruck ft = new FoodTruck();
		Scanner kb = new Scanner(System.in);
		
		ft.truckInput(kb);
		ft.truckMenu(kb);

	}
}
