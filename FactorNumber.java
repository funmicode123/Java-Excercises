import java.util.Scanner;

public class FactorNumber {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
		int count = 0;

		for(int counter =1; counter <= number; counter++){

		if (number % counter ==0) 	
		count++;

		}

		System.out.print(number + " has " + count + " factor");
		
	}

}