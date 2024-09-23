import java.util.Scanner;
public class MilliSeconds{
   public static void main(String... args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter the Milli Seconds:  ");
   long milliSeconds = input.nextLong();
	milliSeconds(milliSeconds);
   
}

public static String milliSeconds(long milliSeconds){
   long secondsPerHour = 3600;
   long minutesPerHour = 60;
   long secondsPerMinute = 60;
   long totalSeconds = milliSeconds / 1000;
   long hours = totalSeconds / secondsPerHour;
   long minutes = (totalSeconds % secondsPerHour) / minutesPerHour;
   long seconds = totalSeconds % secondsPerMinute;

   String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);

   System.out.println(timeString);
   return timeString;




   }



}