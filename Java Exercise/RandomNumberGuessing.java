import java.util.Scanner;

public class RandomNumberGuessing {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		int numberToGuess =1 + (int)(50 * Math.random() );
		int trials = 6;
		int guessedNumber;
		System.out.println("Hello, you can start the guessing: ");
		
	for (int iterate = 0; iterate <= trials; iterate++) {
		
		System.out.println("Guess a number between 1 to 50: ");
		guessedNumber = input.nextInt();

	if (guessedNumber == numberToGuess) {
		System.out.println("Welldone, you have guessed the number in " + iterate ++ + " trials");
			break;
	}
	else if (guessedNumber > numberToGuess && iterate != trials - 1) {
		System.out.println("Too high, try again");
	}

	else if (guessedNumber < numberToGuess && iterate != trials - 1) {
		System.out.println("Too low, try again");
	}

	else {
		System.out.println("Sorry you have exhausted the trials");

		System.out.println("The number was " + numberToGuess);
	}
	
	
	}

	}

}