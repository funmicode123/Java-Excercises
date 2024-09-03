import java.util.Scanner;
public class TaxCalculator {
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Tax name: ");
	String name = input.nextLine();
	System.out.print("Enter your earnings: ");
	double earning = input.nextDouble();
	double percentage1 = 0.15;
	double percentage2 = 0.20;
	double taxResult = getTax(earning);
	System.out.printf("The tax revenue is: %.2f", taxResult);
	}


public static double getTax(double earnings){
	double tax = 0;
	if (earnings <= 30000){
		 tax =(percentage1) * earnings;
	}	
	else{
		tax = (percentage2) * earnings;
	}
	return tax;
}
}