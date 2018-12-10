package by.owl.coursesproject.taxopark;

import java.util.ArrayList;
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

	public List<Car> sort(Comparator<Car> comp) {
		List<Car> sorted = new ArrayList<>(cars);
		Collections.sort(sorted, comp);
		return sorted;
	}

}
