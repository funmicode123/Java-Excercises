import java.util.Scanner;

public class FeetConversion {

	public static void main (String [] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a value in feet: ");
	double value1 = input.nextDouble();
	
	double conversionValue = 0.305;
	
	double convertedValue = value1 * conversionValue;

	System.out.printf(value1 + " feet is" + convertedValue + "meters");
	}

}
