import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int result = compareNumbers(number1, number2);
        System.out.println("Result is: " + result);


    }

    public static int compareNumbers(int number1, int number2) {
        if (number1 == number2) {
            return 0;
        } 
		else if (number1 > number2) {
            	    return 1;
        }
	 else {
            return -1;
        }
    }
}
