import java.util.Scanner;
public class EvenScoresAverage{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int counter = 1;
	int count = 0;
	while (counter <= 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();
		counter ++;
		if (score % 2 == 0){
			total += score;
			count++;
		}
	}
	if (count > 0){
		double average =(double) total / count; 
		System.out.printf("The average of the even score is %.2f", average);
	}

	}
	

}