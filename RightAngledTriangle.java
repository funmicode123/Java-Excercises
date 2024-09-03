import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
	System.out.print("Enter the length of the base of the triangle (1-10): ");
        int baseTriangle = input.nextInt();

          
        for (int count = 1; count <= baseTriangle; count++) {
            for (int counter = 1; counter <= count; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
}
