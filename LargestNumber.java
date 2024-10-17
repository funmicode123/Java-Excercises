import java.util.Scanner;

public class LargestNumber{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	int counter = 10;
	int count = 1;
	int largest = 0;

	while(count <= counter){
		System.out.print("Enter the amount sold: ");
		int amount = input.nextInt();

		if(amount > largest){
		largest = amount;

        	}
        count++;

	}

	System.out.print("The largest amount is: " + largest);
	

	}


}