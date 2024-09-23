import java.util.Scanner;

public class SortedNumber {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            if (number2 >= number3) {
                System.out.println("Numbers in decreasing order: " + number1 + ", " + number2 + ", " + number3);
            } 
	   else {
                System.out.println("Numbers in decreasing order: " + number1 + ", " + number3 + ", " + number2);
            }
        } 
	else if (number2 >= number1 && number2 >= number3) {
            if (number1 >= number3) {
                System.out.println("Numbers in decreasing order: " + number2 + ", " + number1 + ", " + number3);
            }
	     else {
                System.out.println("Numbers in decreasing order: " + number2 + ", " + number3 + ", " + number1);
            }
        } 
	else {
            if (number1 >= number2) {
                System.out.println("Numbers in decreasing order: " + number3 + ", " + number1 + ", " + number2);
            } 
	     else {
                System.out.println("Numbers in decreasing order: " + number3 + ", " + number2 + ", " + number1);
            }
        }

       }
}
 
