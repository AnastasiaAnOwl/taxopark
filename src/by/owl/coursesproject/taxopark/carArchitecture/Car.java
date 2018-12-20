package by.owl.coursesproject.taxopark.carArchitecture;

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

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	@Override
	public String toString() {
		return "Mark: " + model + ";\n\tprice: " + price + "$;\n\tmaxSpeed: " + maxSpeed
				+ " kmph;\n\tfuel consumption: " + fuelConsumption + " per 100 km;\n\tengine: " + engine + "\n";
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return engine;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

}
