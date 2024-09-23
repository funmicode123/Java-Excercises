import java.util.Scanner;
public class Average{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int counter = 1;

	while (counter <= 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();
		total += score;
		counter ++;
	
	}
	double average = (double) total / 10;
	System.out.printf("The average score is %.2f", average);
	}
	

}