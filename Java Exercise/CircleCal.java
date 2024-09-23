import java.util.Scanner;

public class CircleCal {

	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter radius: ");

	double radius = input.nextDouble();

	double pie = 3.14159;

	double perimeter = 2 * radius * pie;

	double area = radius * radius * pie;

	System.out.printf("Perimeter = %.3f%nArea = %.3f%n", perimeter, area);
	

	}



}	

	

