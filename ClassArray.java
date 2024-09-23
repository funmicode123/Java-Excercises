import java.util.Scanner;
public class ClassArray{
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
		for(int count = 0; count< scores.length; count++){
			System.out.printf("%d%s ", scores[count], ",");
		}

	}

}