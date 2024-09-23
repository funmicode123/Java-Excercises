import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime{
   public static void main(String... args){

    LocalDateTime current = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss");
    String formatted = current.format(formatter);
   
   System.out.println("Current Date and Time: " + formatted);
   }


}