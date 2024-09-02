import java.util.Scanner;

public class DeliveryTest{
	public static void main(String... args){
		Scanner input = new Scanner (System.in);

		System.out.print("Enter number of successful deliveries: ");
		int successfulDeliveries = input.nextInt();
		float rateForLess50 = 160;
		float rateFor50To59 = 200;
		float rateFor60To69 = 250;
		float rateForAbove70 = 500;
		int basePay = 5000;
		float rate;

		float calculatePay = DeliveryClass.calculateWages(successfulDeliveries, rateForLess50, rateFor50To59, rateFor60To69, rateForAbove70, basePay);
		
		System.out.printf("The wages of the rider is: %.2f", calculatePay);
		


	}


}




