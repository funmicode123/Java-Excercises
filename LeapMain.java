import java.util.Scanner;
public class LeapMain{

public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the year:");
   int yearInputted = input.nextInt();
   
      System.out.print(LeapYear.isLeapYear(yearInputted));
        
   }




}