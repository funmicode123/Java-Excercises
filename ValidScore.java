import java.util.Scanner;
public class ValidScore{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int count = 0;
	
	while (count < 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();

		if (score > 0 && score < 100){
			total += score;
			count ++;
		}

	}
	System.out.printf("The sum of valid 10 scores is %d ", total);
	
	
	}	
	

}
