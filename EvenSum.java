import java.util.Scanner;
public class EvenSum{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int total = 0;
	int counter = 1;

	while (counter <= 10){
		System.out.print("Enter the score: ");
		int score = input.nextInt();
		if (counter % 2 == 0)
			total += score;
		counter ++;
		
	}
	System.out.printf("The sum of the even index score is %d", total);
	}
	

}