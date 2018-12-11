package by.owl.coursesproject.taxopark.carArchitecture;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarPark {

	private List<Car> cars;

	public CarPark(List<Car> cars) {
		this.cars = cars;
	}

	public int totalPrice() {
		int total = 0;
		for (Car car : cars) {
			total += car.getPrice();
		}
		return total;
	}

	public void sort(Comparator<Car> comp) {
		Collections.sort(cars, comp);
	}

	public List<Car> getCars() {
		return cars;
	}

}
