import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String... args) {

		displayCalculatorMenu();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		int count = 0;
		System.out.print(getResult(number + " is a prime number"));

	public static int getResult(int integer){
	for(int counter =1; counter <= number; counter++){
		if (number % counter == 0) 
		count++;
		}
	if (count ==2)
	return number;
	else 
	System.out.println(number + " is not a prime number");


	}

}