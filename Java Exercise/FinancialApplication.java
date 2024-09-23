import java.util.Scanner;

public class FinancialApplication {

	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter investment amount: ");

	double investment = input.nextDouble();

	System.out.print("Enter annual interest rate in percentage: ");

	double interest = input.nextDouble();

	System.out.printf("Enter number of years: ");

	int years = input.nextInt();

	double interestPercentage = interest / 100;

	double calculate = 1 + ( interestPercentage / 12 );

	double futureInvestmentvalue = investment * Math.pow((calculate), years * 12);
	
	System.out.printf("Accumulated value is $%.2f", futureInvestmentvalue);




	}



}