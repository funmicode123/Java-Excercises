import java.util.Scanner;
public class Addition{
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
	System.out.printf("The sum of the score is %d", total);
	}
	

}