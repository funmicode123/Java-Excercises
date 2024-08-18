import java.util.Scanner;

public class TableOfSquare {

	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Number\tSquare\tCube");

		int number = 0;

	while (number < 11) {

		int square = number * number;

		int cube = number * number * number;

		System.out.println(number + "\t" +square + "\t" + cube);

		number = number +1;




	}




	}
}