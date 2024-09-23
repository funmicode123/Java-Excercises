import java.util.Scanner;

	public class RunwayLength {

	public static void main(String [] args) {
 
	Scanner input= new Scanner(System.in);

	System.out.print("Enter the speed and acceleration: ");

	double vixen = input.nextDouble();

	double acceleration = input.nextDouble();

	double vixenSquare = vixen * vixen;

	double accelerationTwice = 2 * acceleration;

	double length = vixenSquare / accelerationTwice;


	System.out.printf("The minimum runway length for this airplane is : %.3f", length);


}



}