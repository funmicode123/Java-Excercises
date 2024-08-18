import java.util.Scanner;

public class Comparing {

	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the integer: ");

	int number = input.nextInt();
	
	int square = number * number;

	if (number > 100) {

	System.out.printf("%d >100%n", number);
	}

	if (number == 100) {

	System.out.printf("%d == 100%n", number);
	}

	if (number != 100) {

	System.out.printf("%d != 100%n", number);
	}

	if (number < 100) {

	System.out.printf("%d < 100%n ");
	}

	if (square > 100) {

	System.out.printf("%d > 100%n", square);
	}

	if (square == 100) {

	System.out.printf("%d == 100%n", square);
	}

	if (square != 100) {

	System.out.printf("%d != 100%n", square);
	}

	if (square < 100) {

	System.out.printf("%d < 100%n", square);
	}

	}

}
