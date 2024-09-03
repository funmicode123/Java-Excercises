import java.util.Scanner;
public class CreditCardTest {
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("The new account number is: ");
	int accountNumber = input.nextInt();
		
	System.out.print("The balance at the beginning of the month is: ");
	int balance = input.nextInt();

	System.out.print("The total charges is: ");
	int totalCharges = input.nextInt();

	System.out.print("The total credit: ");
	int totalCredit = input.nextInt();

	System.out.print("The credit limit: ");
	int creditLimit = input.nextInt();
	
	int newBalance = balance + totalCharges + totalCredit;

	System.out.print("The new balance is: ", newBalance);


	if (newBalance > creditLimit)
	System.out.print("The credit limit is exceeded");



	}


}