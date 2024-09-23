import java.util.Scanner;
public class EvenScores{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int counter = 1;

	while (counter <= 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();
		if (score % 2 == 0)
			total += score;
		counter ++;
		
	}
	System.out.printf("The sum of the even score is %d", total);
	}
	

}