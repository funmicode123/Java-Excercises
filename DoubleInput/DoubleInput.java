public class DoubleInput{

   public static int myFloor(double number){
      return (int) number;
   }

   public static int myCeil(double number){
      int intNumber = (int) number;
      if (number > intNumber) 
            return intNumber + 1;
   
      else 
            return intNumber;

   }

}