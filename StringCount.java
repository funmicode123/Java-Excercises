import java.util.Scanner;
public class StringCount{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the string: ");
   String stringInput = input.nextLine();

   int counter = countLetter(stringInput);
   System.out.print("The number of letter(s) in the string is " + counter);
   }

   public static int countLetter(String letter){
     int count = letter.length();

     return count;

   }



}