
public class SquareAsterisks{

   
   public static void displaySquare(int row){
   for(int counter = row; counter > 0; counter--){
       for(int inner = row; inner > 0 ; inner--){
	System.out.print("* ");

      }
   System.out.println();
   }
   }
}