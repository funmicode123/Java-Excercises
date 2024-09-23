import java.util.*;
public class ArrayExample{
	public static void main(String... args){
	int [] scores = new int[10];
	Scanner input = new Scanner(System.in);
	for (int count = 0; count < 10; count++){
		System.out.println("Enter score: ");
		scores[count] = input.nextInt();
	}
	System.out.printf("%s%10s%n", "index", "score");
	for (int count = 0; count < 10; count++){
		System.out.printf("%5d%10d%n", count, scores[count]);

	}
	System.out.print("Score: ");
	for (int count = 0; count < 10; count++){
		System.out.printf("%3d%c", scores[count], ',');
	}

	}


}