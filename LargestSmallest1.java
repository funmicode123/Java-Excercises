import java.util.Scanner;

public  class LargestSmallest1 {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the integer1: ");

	int digit1 = input.nextInt;

	System.out.print("Enter the integer2: ");

	int digit2 = input.nextInt;

	System.out.print("Enter the integer3: ");

	int digit3 = input.nextInt;

	System.out.print("Enter the integer4: ");

	int digit4 = input.nextInt;

	System.out.print("Enter the integer5: ");

	int digit5 = input.nextInt;

	if (digit1 > digit2 && digit1 > digit3 && digit1 > digit4 && digit1 > digit5) {

	System.out.println(digit1 + " is the largest");
	}

	else if (digit2 > digit1 && digit2 > digit3 && digit2 > digit4 && digit2 > digit5) 	{

	System.out.println(digit2 + " is the largest");
	}

	else if (digit3 > digit1 && digit3 > digit2 && digit3 > digit4 && digit3 > digit5) 	{

	System.out.println(digit3 + " is the largest");
	}

	else if (digit4 > digit1 && digit4 > digit2 && digit4 > digit5 && digit4 > digit1) 	{

	System.out.println(digit4 + " is the largest");
	}

	else if (digit5 > digit1 && digit5 > digit2 && digit5 > digit3 && digit5 > digit4) 	{

	System.out.println(digit5 + " is the largest");
	}

	if (digit1 < digit2 && digit1 < digit3 && digit1 < digit4 && digit1 < digit5) {

	System.out.println(digit1 + " is the smallest");
	}

	else if (digit2 < digit1 && digit2 < digit3 && digit2 < digit4 && digit2 < digit5) 	{

	System.out.println(digit2 + " is the smallest");
	}

	else if (digit3 < digit1 && digit3 < digit2 && digit3 < digit4 && digit3 < digit5) 	{

	System.out.println(digit3 + " is the smallest");
	}

	else if (digit4 < digit1 && digit4 < digit2 && digit4 < digit5 && digit4 < digit1) 	{

	System.out.println(digit4 + " is the smallest");
	}

	else if (digit5 < digit1 && digit5 < digit2 && digit5 < digit3 && digit5 < digit4) 	{

	System.out.println(digit5 + " is the smallest");
	}




	}
}