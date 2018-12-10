package by.owl.coursesproject.taxopark;

import by.owl.coursesproject.taxopark.engines.Engine;

public class Car {

	private String model;
	private Engine engine;
	private double fuelConsumption;
	private int maxSpeed;
	private int price;

	public Car(String model, Engine engine, double fuelConsumption, int maxSpeed, int price) {
		this.model = model;
		this.engine = engine;
		this.fuelConsumption = fuelConsumption;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Mark: " + model + "; /n price: " + price + "$;/n maxSpeed: " + maxSpeed + " kmph;/n fuel consumption: "
				+ fuelConsumption + " per 100 km; engine: " + engine;
	}

}
