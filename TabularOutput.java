import java.util.Scanner;

public class TableOfSquare {

	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("N\tN^2\tN^3\tN^4");

		System.out.println();
		int number = 1;

	while (number < 6) {

		int square = (int)Math.pow(number, 2);
		int cube = (int)Math.pow(number, 3);
		int quad = (int)Math.pow(number, 4);

		System.out.println(number + "\t" + square + "\t" + cube + "\t" + quad);

		number += 1;




	}




	}
}