package by.owl.coursesproject.taxopark;

import by.owl.coursesproject.taxopark.engines.Diesel;
import by.owl.coursesproject.taxopark.engines.Gasoline;
import by.owl.coursesproject.taxopark.exception.UnknownModelException;

public class CarFactory {

	public static Car create(CarModel model) {
		switch (model) {
		case KIA_CEEDS:
			return new Car("Kia Ceed's", new Gasoline(), 6.8, 200, 6_000);
		case TOYOTA_COROLLA:
			return new Car("Toyota Corolla", new Diesel(), 6.6, 270, 10_000);
		case OPEL_ZAFIRA:
			return new Car("Opel Zafira", new Gasoline(), 6.6, 180, 8_000);
		case BMW_X5:
			return new Car("BMW X5", new Gasoline(), 7, 300, 15_000);
		default:
			throw new UnknownModelException(model.getName());
		}

	}

}
