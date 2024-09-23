import java.util.Scanner;
public class SeparatingDigits {

	public static void main(String... args){
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the integer:");
	int number = input.nextInt();
	int digit1 = number % 10;
	number = number / 10;
	int digit2 = number %10;
	number = number / 10;
	int digit3 = number % 10;
	number = number / 10;
	int digit4 = number %10;
	number = number / 10;
	int digit5 = number % 10;
	System.out.println(digit5 +"\t"+ digit4 +"\t"+ digit3+ "\t"+ digit2+ "\t"+ digit1+ "\t");


	}
}