import java.util.Scanner;
public class Timestable {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter multipled number: ");
		int multipleNumber = input.nextInt();
	
		for(int count =1; count <= 10; count++){
			System.out.printf("%d * %d = %d%n", multipleNumber, count, multipleNumber * count);
		}
	}
}