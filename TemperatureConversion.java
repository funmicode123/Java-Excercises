/*
1. collect the temperature in celsius
2. save the variable as celsius
3. perform calculation, (9/5) * celsius + 32
4. save result as fahrenheit
5. display the result
*/


import java.util.Scanner;
public class TemperatureConversion{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the temperature in celsius: ");
   double celsius = input.nextDouble();
   final int NINE = 9;
   final int FIVE = 5;
   final int TEMP = 32;
    
   System.out.print(getFahrenheit(celsius, NINE, FIVE, TEMP));
   }

   public static string getFahrenheit(double celsius, final int NINE, final int FIVE, final int TEMP){
   double fahrenheit = (NINE * celsius) / FIVE  + TEMP;

   return fahrenheit + "is Fahrenheit conversion";


   }


}