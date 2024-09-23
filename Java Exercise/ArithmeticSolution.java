import java.util.Scanner;

public class ArithmeticSolution {

	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first and second integer: ");

	int number1 = input.nextInt();

	int number2 = input.nextInt();

	double square1 = number1 * number1;

	System.out.printf("Square1 = %.2f%n: ", square1);

	double square2 = number2 * number2;

	System.out.printf("Square2 = %.2f%n: ", square2);

	double squareSum = square1 + square2;

	System.out.printf("Sum = %.2f%n", squareSum);

	double difference = square2 - square1;

	System.out.printf("Difference = %.2f%n", difference);



	}



}






