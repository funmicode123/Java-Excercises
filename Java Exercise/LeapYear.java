
public class LeapYear{
  
   public static String isLeapYear(int yearInputted){
      if (yearInputted % 4 == 0 && yearInputted % 100 !=0)

      return yearInputted + " it's a leap year: ";

   else
     return yearInputted + " it's not a leap year: ";
   }


}