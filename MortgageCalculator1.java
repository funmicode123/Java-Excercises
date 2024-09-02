import java.util.Scanner;
public class MortgageCalculator1 {
   private int principal;
   private double rate;
   private int duration;
   
   public static void main(String... args) {

	Scanner input = new Scanner(System.in);
	MortgageCalculator1 calculator = new MortgageCalculator1();
	System.out.print("Enter the principal amount: ");
	int principal1 = input.nextInt();
	System.out.print("Enter the annual interest rate: ");
	double rate1 = input.nextDouble();
	System.out.print("Enter the duration in years: ");
	int duration1 = input.nextInt();


	calculator.setPrincipal(principal1);
	calculator.setRate(rate1);
	calculator.setDuration(duration1);

	double mortgageResult = calculator.computeMortgage();
	System.out.printf("The mortgage result: %.2f", mortgageResult);
 	
   }


	public void setPrincipal(int principal1){
		this.principal = principal1;
	}

	public void setRate(double rate1){
		this.rate = rate1;
	}

	public void setDuration(int duration1){
		this.duration = duration1;
	}


	public double computeMortgage(){
		double monthlyRate = (rate / 100);
		double percentageRate = monthlyRate / 12;
		double noOfMonths = duration * 12;
		double numerator = percentageRate * Math.pow((1 + percentageRate), 	noOfMonths);
		double denominator = Math.pow((1 + percentageRate), noOfMonths) - 1;
	return principal * (numerator / denominator);



	}

}
