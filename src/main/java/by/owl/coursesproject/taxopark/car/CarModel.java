package by.owl.coursesproject.taxopark.car;

public enum CarModel {

	KIA_CEEDS("Kia Ceed's"), TOYOTA_COROLLA("Toyota Corolla"), OPEL_ZAFIRA("Opel Zafira"), BMW_X5("BMW X5");

	private String name;

	CarModel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
