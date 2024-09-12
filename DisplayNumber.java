import java.util.Scanner;
public class DisplayNumber {

	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

	System.out.print("Enter second number: ");
	int number2 = input.nextInt();
	int numberCounter = 0;
		printNumbers(number1, number2, numberCounter);

	}
	public static void printNumbers(int number1, int number2, int numberCounter){
		
		int counter = number1;
		
		while (counter <= number2){
			System.out.printf("%d ", counter);
			counter++;

			numberCounter++;

			if(numberCounter % 10 == 0){
			System.out.println();
		}
			

		}
		
	}


}