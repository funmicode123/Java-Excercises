import java.util.Scanner;
public class FormatDigit{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the integer: ");
   int number = input.nextInt();

   System.out.print("Enter the width: ");
   int width = input.nextInt();

   String formattedNumber = format(number, width);
   System.out.print("The formatted number: " + formattedNumber);
   }

   public static String format(int number, int width){
      String numberToString = Integer.toString(number);
      if (numberToString.length() < width) {
          return String.format("%0" + width + "d", number);  
      } 
      else {
          return numberToString;
      }
   }


}