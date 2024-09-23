import java.util.Scanner;

public class RandomNumber {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		int numberToGuess =1 + (int)(10 * Math.random() );
		int counter = 0;
		int count = 1;
		int guessedNumber;
		System.out.println("Hello, you can start the guessing: ");
	

	do {	
		System.out.print("Guess a number between 1 to 10: ");
		guessedNumber = input.nextInt();
	
	      if (guessedNumber == numberToGuess) {
		System.out.println("Welldone, you have guessed the number in " + count + " trials");
			break;
	     }
	      if (guessedNumber > numberToGuess ) {
		System.out.println("Too high, try again");
	     }

	      if (guessedNumber < numberToGuess) {
		System.out.println("Too low, try again");
	   }
	

		counter++;
		count++;

		if (counter == 10) {
		 System.out.print("Guessing over");
			 break;
		}	
		
	}

	while(guessedNumber != numberToGuess);
	
	}

}