import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = input.nextInt();
		String result = getResult(number);
		System.out.print(result);
	}

public static String getResult(int number){
	int count = 0;
	for(int counter =1; counter <= number; counter++){
	   if (number % counter == 0) 
	   count++;
	}
	if (count ==2)
	    return number + " is a prime number";
	else 
	    return number + " is not a prime number";


	}

}