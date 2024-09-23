 import java.util.Scanner;
public class PhoneKeypads{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a string:  ");
   String stringInput = input.nextLine().toUpperCase();

   for (int count =0; count < stringInput.length(); count++){
        char letter = stringInput.charAt(count);

	if (Character.isLetter(letter)) 
           System.out.print(getNumber(letter));
	else
	   System.out.print(letter);
   }
   System.out.println();
   }

public static int getNumber(char uppercaseLetter){
  switch (uppercaseLetter){
	    case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default:
                return -1;

            }
   }


}