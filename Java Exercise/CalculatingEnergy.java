import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String [] args) {
 
	Scanner input= new Scanner(System.in);

	System.out.print("Enter the amount of water in kilogram: ");

	double amountOfwater = input.nextDouble();

	System.out.print("Enter the inital temperature: ");

	double initialtemperature = input.nextDouble();

	System.out.print("Enter the final temperature: ");

	double finaltemperature = input.nextDouble();

	double temperature = finaltemperature - initialtemperature;

	double weight = amountOfwater * temperature;

	double energy = weight * 4184;

	System.out.printf("The energy needed is %.1f", energy);


	}






}