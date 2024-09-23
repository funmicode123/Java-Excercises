import java.util.Scanner;

public class Palindrome {

	public static void main(String [] args) {
 
	Scanner input= new Scanner(System.in);

	System.out.print("Enter a three-digit integer: ");

	int palindrome = input.nextInt();

	int number = palindrome;

 	int digit1 = palindrome % 10;

	 palindrome = palindrome / 10;

	int digit2 = palindrome % 10;

	 palindrome = palindrome / 10;

	int digit3 = palindrome % 10;

	 palindrome = palindrome / 10;

	if (digit1 == digit3){

	System.out.print(number + " is a palindrome");

	}
	
	else {
	
	System.out.print(number + " is not a palindrome");
	}

	}

}
