import java.util.Scanner;
public class SidedMain{

   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter number for side1: ");
   double side1 = input.nextDouble();
   System.out.print("Enter number for side2: ");
   double side2 = input.nextDouble();

   double hypotenuse = SidedCalculation.getHypotenuse(side1, side2);
   System.out.printf("The hypotenuse is %.2f", hypotenuse);
   }

}
