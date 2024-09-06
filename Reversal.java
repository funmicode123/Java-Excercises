import java.util.Scanner;
public class Reversal {
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the integer: ");
	int number = input.nextInt();
		displayReverse(number);

	}

	public static void displayReverse(int number){
	int reverse = 0;

	while(number != 0){
		reverse = (reverse * 10) + number % 10;
		number = number / 10;

	}
	System.out.println("The reversed number: " + reverse);

	}
}