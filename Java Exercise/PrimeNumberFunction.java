import java.util.Scanner;

public class PrimeNumberFunction {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } 
	else {
            System.out.println(number + " is not a prime number.");
        }

        }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count == 2;
     
  }
}
