package model;

import model.exceptions.InvalidDimesionException;

public class Validator {
	
	private double validateDimensionValue(String name, String textValue) throws InvalidDimesionException {
		
		double value = 0;
		
		try {
			value = Double.parseDouble(textValue);
		} catch (NullPointerException e) {
			throw new InvalidDimesionException(name + " is null");
		} catch (NumberFormatException e) {
			throw new InvalidDimesionException(name + " not a number");
		}
		
		if(value <= 0) {
			throw new InvalidDimesionException(name + " not positive");
		}
		
		return value;
	}
	
	public double validateWidthValue(String widthValue) throws InvalidDimesionException {
		return validateDimensionValue("width", widthValue);
		
	}
	
	public double validateHeightValue(String heightValue) throws InvalidDimesionException {
		return validateDimensionValue("height", heightValue);
		
	}
}
