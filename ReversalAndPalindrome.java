import java.util.Scanner;
public class ReversalAndPalindrome {
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the integer: ");
	int number = input.nextInt();
		displayReverse(number);
		isPalindrome(number);

	int reversed = displayReverse(number);
	if(isPalindrome(number)) {
		System.out.println(number + " is a palindrome");
	}
	else {
		System.out.println(number + " is not a palindrome");
	}


	}

	public static int displayReverse(int number){
	int reverse = 0;

	while(number != 0){
		reverse = (reverse * 10) + number % 10;
		number = number / 10;

	}
	System.out.println("The reversed number: " + reverse);
	return reverse;
	}

	public static Boolean isPalindrome(int number){
		return number == displayReverse(number);
	}

}