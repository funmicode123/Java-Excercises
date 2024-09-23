import java.util.Scanner;
public class OnlyValid{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int count = 0;
	int counter =0;
	while (counter < 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();
		counter++;

		if (score > 0 && score < 100){
			total += score;
			count ++;
		}

	}
	System.out.printf("The sum of valid number from 10 entries is %d ", total);
	
	
	}	
	

}
