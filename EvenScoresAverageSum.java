import java.util.Scanner;
public class EvenScoresAverageSum{
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
		int average = total / count; 
		System.out.printf("The sum of the even score is %d%n", total);
		System.out.printf("The average of the even score is %d", average);
	}

	}
	

}