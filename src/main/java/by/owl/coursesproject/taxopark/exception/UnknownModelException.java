package by.owl.coursesproject.taxopark.exception;

public class UnknownModelException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UnknownModelException(String model) {
		super("Unknown model: " + model);
	}
	
	

}
