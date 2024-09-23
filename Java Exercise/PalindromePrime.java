import java.util.Scanner;

public class PrimeNumber1 {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = input.nextInt();

        printPalindromePrime(count);
    
    }

    public static boolean getPrime(int number) {
        if (number <= 1) return false; 
        int count = 0;
        for (int counter = 1; counter <= number; counter++) {
            if (number % counter == 0) 
                count++;
        }
        return count == 2; 
    }

    public static boolean getPalindrome(int number) {
        String numberToString = Integer.toString(number);
        String reversedStr = new StringBuilder(numberToString).reverse().toString(); 
        return numberToString.equals(reversedStr); 
    }

    public static void printPalindromePrime(int count) {
        int number = 2;
        int found = 0;
	int lineCount = 0;
        while (found < count) {
            if (getPrime(number) && getPalindrome(number)) {
                System.out.print(number + " ");
                found++;
                lineCount++;

                if (lineCount % 10 == 0) 
                    System.out.println();
                    
            }
            number++; 
        }
    }
}
