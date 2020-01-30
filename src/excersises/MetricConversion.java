package excersises;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		
		double convertLiters;
		double convertCentimeters;
		double imperialEntry;
		GetMeasurements imperialNum1 = new GetMeasurements();
		GetMeasurements litersNum1 = new GetMeasurements();
		GetMeasurements centimetersNum1 = new GetMeasurements();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a unit of measurement to be converted >>> ");
		imperialEntry = input.nextDouble();
		
		convertLiters = GallonsToLiters(imperialEntry);
		convertCentimeters = InchesToCentimeters(imperialEntry);
		imperialNum1.setImperialMeasurement(imperialEntry);
		litersNum1.setLiterMeasurement(convertLiters);
		centimetersNum1.setCentimeterMeasurement(convertCentimeters);
		System.out.println("The imperial number in inches to centimeters is " + convertCentimeters);
		System.out.println("The imperial number in gallons to liters is " + convertLiters);
		
		System.out.println(imperialNum1.getImperialMeasurement() + " imperial entry");
		System.out.println(litersNum1.getLiterMeasurement() + " liters");
		System.out.println(centimetersNum1.getCentimeterMeasurement() + " centimeters");
		
	}
	public static double GallonsToLiters(double l) {
		
		double convertLiters;
		convertLiters = l * 3.7854;
		return convertLiters;
	}
	public static double InchesToCentimeters(double c) {
		
		double convertCentimeters;
		convertCentimeters = c * 2.54;
		return convertCentimeters;
	}

}
