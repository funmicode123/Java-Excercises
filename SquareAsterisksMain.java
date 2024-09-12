import java.util.Scanner;
public class SquareAsterisksMain{

public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the number of sides: ");
   int numberOfSides = input.nextInt();
   
       SquareAsterisks.displaySquare(numberOfSides);

   }

}