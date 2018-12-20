package by.owl.coursesproject.taxopark.car.provider;

import java.util.ArrayList;
import java.util.List;

import by.owl.coursesproject.taxopark.car.Car;
import by.owl.coursesproject.taxopark.car.CarFactory;
import by.owl.coursesproject.taxopark.car.CarModel;

public class HardcodedProvider implements CarProvider {

	@Override
	public List<Car> getCars() {
		List<Car> cars = new ArrayList<>();

		cars.add(CarFactory.create(CarModel.BMW_X5));
		cars.add(CarFactory.create(CarModel.KIA_CEEDS));
		cars.add(CarFactory.create(CarModel.KIA_CEEDS));
		cars.add(CarFactory.create(CarModel.TOYOTA_COROLLA));
		cars.add(CarFactory.create(CarModel.OPEL_ZAFIRA));
		return cars;
	}
}
