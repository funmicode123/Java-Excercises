import.util.java.Scanner;

public class FutureInvestmentValue {

	public static void main (String [] args);

	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount: ");

	double investment = input.nextDouble();

	System.out.print("Enter annual interest rate in percentage: ");

	double interest = input.nextDouble();

	System.out.print("Enter number of years: ");

	double years = input.nextDouble();

	interestPercentage = interest/100;

	calculate = 1 + interestPercentage / 12;

	calculate1 = calculate * calculate;

	int calculate1 = 1;

	while (calculate1 <= 12) {

	double futureInterestvalue = amount * calculate1;
	
	System.out.print("Accumulated value is $ %f",futureInvestmentvalue);


	}


	}



}