package model;

import model.database.DatabaseHandler;
import model.exceptions.InvalidDimesionException;
public class TestModel {

	// only need a single object of model, because the model encapsulates
	// the database, we only have a single data
	
	// a reference of a single model object we create
	private static TestModel model;
	
	private Validator validator;
	
	private DatabaseHandler databaseHandler;
	
	private TestModel() {
		// this constructor can only be invoked within this class
		
		// one validator object to validate all user input
		validator = new Validator();
		
		databaseHandler = new DatabaseHandler();
	}
	
	public String calculateArea(String widthValue, String heightValue) {
		
		double width, height;
		
		try {
			width = validator.validateWidthValue(widthValue);
		} catch (InvalidDimesionException e) {
			return e.getMessage();
		}
		
		try {
			height = validator.validateHeightValue(heightValue);
		} catch (InvalidDimesionException e) {
			return e.getMessage();
		}
		
		double area = width * height;

		// convert area to a string and return it
		return Double.toString(area);
		
	}
	
	public String saveData(String widthValue, String heightValue, String areaValue) {
		return databaseHandler.saveAllData(widthValue, heightValue, areaValue);
	}
	
	// the user can only call the following static method to
	// get access to the single model object
	public static TestModel getInstance() {
		
		if(model != null) {
			return model; // the reference is already referred to the object
		}
		
		// otherwise we create 1 object of the model and return it
		
		model = new TestModel();
		
		return model;
	}
	
	
	
	
	
	
	
	
}
