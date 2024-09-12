import java.util.Scanner;
public class DoubleInputMain{

   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the positive number: ");
   double number = input.nextDouble();
   
    if (number < 0){
      System.out.print("Number is not a positive integer");
      return;
    }
    
     System.out.println("The floor: " + DoubleInput.myFloor(number));
     System.out.println("The ceil: " + DoubleInput.myCeil(number));
   }

}