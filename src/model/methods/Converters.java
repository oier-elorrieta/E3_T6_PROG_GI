package model.methods;

public class Converters {

	public static int stringToInt(String toCheck){
		int checked = Integer.parseInt(toCheck);
		return checked;
	}
	
	public static double stringToDouble(String toCheck){
		double checked = Double.parseDouble(toCheck);
		return checked;
	}

	
	public static char stringToChar(String toCheck) {
		char checked = toCheck.charAt(0);
		return checked;
	}
}
