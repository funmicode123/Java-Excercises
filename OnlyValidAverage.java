import java.util.Scanner;
public class OnlyValidAverage{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int count = 0;
	int counter = 0;
	while (counter < 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();
		counter++;

		if (score > 0 && score < 100){
			total += score;
			count ++;
		}

	}
	double average = (double) total / count;
	System.out.printf("The average of valid number from 10 entries is %.2f ", average);
	
	
	}	
	

}
