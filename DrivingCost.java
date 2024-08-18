import java.util.Scanner;

public class DrivingCost {

	public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value for distance : ");

	double distance = input.nextDouble();
	
	System.out.print("Enter a value for fuelEfficieny : ");

	double fuelEfficiency = input.nextDouble();

	System.out.print("Enter a value for pricePerGallon : ");

	double pricePerGallon = input.nextDouble();

	System.out.printf("Calculate value for costOftrip : ");

	double costOfTrip = (distance * pricePerGallon) / fuelEfficiency;
	
	
	System.out.printf("The cost of driving is $ %.2f%n ", costOfTrip);


	}

}