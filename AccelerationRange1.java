import java.util.Scanner;

	public class AccelerationRange1 {

	public static void main(String [] args) {
 
	Scanner input= new Scanner(System.in);

	System.out.print("Enter the valve1, valve2 and time: ");

	double valve1 = input.nextDouble();

	double valve2 = input.nextDouble();

	double time = input.nextDouble();

	double acce = valve2 - valve1;

 	double acceleration = acce / time;

	System.out.printf("The average acceleration is %.4f", acceleration);

	}
	

	}