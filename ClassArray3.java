import java.util.Scanner;
public class ClassArray3{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		int[] scores;

		System.out.print("Enter the number of scores: ");
		int scoreNum = input.nextInt();
		scores = new int[scoreNum];
		for(int count = 0; count< scoreNum; count++){
			System.out.printf("Enter the scores %d: ", count);
			int score = input.nextInt();
			scores[count] = score;
		}
		double total = 0;

		for(int count = 0; count< scores.length; count++){
			System.out.printf("%d%s ", scores[count], ",");
			total += scores[count];

		}
		int largest = scores[0];
		for(int count = 0; count < scores.length; count++){
			if (largest < scores[count]){
				largest = scores[count];
			}

		}

		System.out.printf("The largest number is: %d%n", largest);

		int lowest = scores[0];
		

		for(int count = 0; count < scores.length; count++){
			if(scores[count] < lowest)
				lowest = scores[count];
				
		}
		System.out.printf("The lowest number is: %d%n", lowest);
		double average = total / scores.length;
		System.out.print("The average number is: " + average);

	}

}