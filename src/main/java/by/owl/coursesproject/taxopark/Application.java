package by.owl.coursesproject.taxopark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.List;

import by.owl.coursesproject.taxopark.car.Car;
import by.owl.coursesproject.taxopark.car.CarPark;
import by.owl.coursesproject.taxopark.car.provider.CarProvider;
import by.owl.coursesproject.taxopark.car.provider.JsonProvider;

public class Application {
	private static String totalPrice;

	private static CarProvider provider = new JsonProvider();

	public static void main(String[] args) throws IOException {
		CarPark carPark = buildCarPark();
		showMainMenu(carPark);
	}

	private static CarPark buildCarPark() {
		List<Car> cars = provider.getCars();
		return new CarPark(cars);
	}

	private static void showMainMenu(CarPark carPark) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to my Taxopark!");
		do {
			displayMainMenu();
			String line = br.readLine();
			if (line.isEmpty()) {
				continue;
			}
			switch (line.charAt(0)) {
			case '1':
				showCars(carPark, br);
				break;
			case '2':
				showTotalPrice(carPark);
				break;
			case '3':
				break;
			}
		} while (true);
	}

	private static void displayMainMenu() {
		System.out.println("1. Display all cars");
		System.out.println("2. Show total price");
		System.out.println("3. Exit");
		System.out.print("[1, 2, 3] >");
	}

	private static void showTotalPrice(CarPark carPark) {
		System.out.println();
		System.out.println("The total cost of taxi station is " + getTotalPrice(carPark));
		System.out.println();
	}

	private static String getTotalPrice(CarPark carPark) {
		if (totalPrice == null) {
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			totalPrice = formatter.format(carPark.totalPrice());
		}
		return totalPrice;
	}

	private static void showCars(CarPark carPark, BufferedReader br) throws IOException {
		String line;
		do {
			displaySortingMenu();
			line = br.readLine();
			if (line.isEmpty()) {
				continue;
			}
			switch (line.charAt(0)) {
			case '1':
				carPark.sort((Car car0, Car car1) -> car0.getPrice() - car1.getPrice());
				break;
			case '2':
				carPark.sort((Car car0, Car car1) -> car0.getMaxSpeed() - car1.getMaxSpeed());
				break;
			case '3':
				carPark.sort((Car car0,
						Car car1) -> (int) (car0.getFuelConsumption() * 100 - car1.getFuelConsumption() * 100));
				break;
			case '4':
				break;
			}
			carPark.getCars().forEach(System.out::println);
		} while (true);
	}

	private static void displaySortingMenu() {
		System.out.println("How would you like to sort them?");
		System.out.println("1. By price");
		System.out.println("2. By maximum speed");
		System.out.println("3. By fuel consumption");
		System.out.println("4. Get back to menu");
		System.out.print("[1, 2, 3, 4] >");
	}

}
