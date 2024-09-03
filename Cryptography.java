import java.util.Scanner;
public class Cryptography {
	public static void main(String... args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter integer1: ");
	int number = input.nextInt();
	
	int getEncryptedResult = getEncrypted(number);
	System.out.println("Encrypted: " + getEncryptedResult);

	}

public static int getEncrypted(int number){
int digit1 = number % 10;
number = number / 10;
int digit2 = number % 10;
number = number / 10;
int digit3 = number % 10;
number = number / 10;
int digit4 = number % 10 ;
number = number / 10;


int alpha1= (digit1 + 7 % 10 );
int alpha2 = (digit2 + 7 % 10);
int alpha3 = (digit3 + 7 % 10);
int alpha4 = (digit4 + 7 % 10);

int encrypted = (alpha3 * 1000) + (alpha4 * 100) + (alpha1 * 10) + alpha2;
return encrypted;
}


}




