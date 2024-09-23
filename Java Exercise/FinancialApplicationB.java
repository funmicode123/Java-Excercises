	double annualInterest = input.nextDouble();

	double annualInterestCal = annualInterest / 1200;

	double nextInterest = balance * annualInterestCal;

	System.out.printf("The interest is %.5f", nextInterest);
import java.util.Scanner;

public class FinancialApplicationB {

	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter balance and interest rate e.g., 3 for 3%): ");

	int balance = input.nextInt();


	}

}