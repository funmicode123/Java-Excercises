import java.util.Scanner;
public class BeautifyStringMain{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the string: ");
     String example = input.nextLine();

     String beautifiedString = BeautifyString.checkString(example);
     System.out.print("The beatified string: " + beautifiedString);

   }

}