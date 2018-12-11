package by.owl.coursesproject.taxopark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws IOException {

		List<Car> cars = new ArrayList<>();

		cars.add(CarFactory.create(CarModel.BMW_X5));
		cars.add(CarFactory.create(CarModel.KIA_CEEDS));
		cars.add(CarFactory.create(CarModel.KIA_CEEDS));
		cars.add(CarFactory.create(CarModel.TOYOTA_COROLLA));
		cars.add(CarFactory.create(CarModel.OPEL_ZAFIRA));

		CarPark carPark = new CarPark(cars);

		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(carPark.totalPrice());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welcome to my Taxopark!");

		OUTER_LOOP: do {
			System.out.println("1. Display all cars");
			System.out.println("2. Show total price");
			System.out.println("3. Exit");
			System.out.print("[1, 2, 3] >");
			String line = br.readLine();
			if (line.isEmpty()) {
				continue OUTER_LOOP;
			} else {
				switch (line.charAt(0)) {
				case '1':
					INNER_LOOP: do {
						System.out.println("How would you like to sort them?");
						System.out.println("1. By price");
						System.out.println("2. By maximum speed");
						System.out.println("3. By fuel consumption");
						System.out.println("4. Get back to menu");
						System.out.println("[1, 2, 3, 4] >");
						line = br.readLine();
						if (line.isEmpty()) {
							continue INNER_LOOP;
						} else {
							switch (line.charAt(0)) {
							case '1':
								carPark.sort((Car car0, Car car1) -> car0.getPrice() - car1.getPrice());
								carPark.getCars().forEach(System.out::println);
								break;
							case '2':
								carPark.sort((Car car0, Car car1) -> car0.getMaxSpeed() - car1.getMaxSpeed());
								carPark.getCars().forEach(System.out::println);
								break;
							case '3':
								carPark.sort((Car car0, Car car1) -> (int) (car0.getFuelConsumption() * 100
										- car1.getFuelConsumption() * 100));
								carPark.getCars().forEach(System.out::println);
								break;

							case '4':
								break INNER_LOOP;
							}
						}
					} while (true);
					break;

				case '2':
					System.out.println();
					System.out.println("The total cost of taxi station is " + moneyString);
					System.out.println();
					break;
				case '3':
					break OUTER_LOOP;
				}
			}
		} while (true);

	}

}
