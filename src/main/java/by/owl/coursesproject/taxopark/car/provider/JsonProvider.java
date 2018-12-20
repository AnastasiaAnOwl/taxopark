package by.owl.coursesproject.taxopark.car.provider;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import by.owl.coursesproject.taxopark.car.Car;

public class JsonProvider implements CarProvider {

	@Override
	public List<Car> getCars() {
		ObjectMapper mapper = new ObjectMapper();
		List<Car> cars = null;
		try {
			cars = mapper.readValue(new File("src/main/resources/cars.json"), new TypeReference<List<Car>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cars;
	}

}
