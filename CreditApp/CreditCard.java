import java.util.Scanner;

public class CreditCardTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("The new account number is: ");
        String accountNumber = input.nextLine(); 

        System.out.print("The balance at the beginning of the month is: ");
        double balance = input.nextDouble();

        System.out.print("The total charges are: ");
        double totalCharges = input.nextDouble();

        System.out.print("The total credit is: ");
        double totalCredit = input.nextDouble();

        System.out.print("The credit limit is: ");
        double creditLimit = input.nextDouble();

        double newBalance = balance + totalCharges - totalCredit;
        System.out.println("The new balance is: " + newBalance);

        if (newBalance > creditLimit) 
            System.out.println("Account " + accountNumber + ": Credit limit exceeded.");

        else 
            System.out.println("Account " + accountNumber + ": Within credit limit.");
        


    }
}
