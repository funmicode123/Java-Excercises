import java.util.Scanner;

public class Geometry {

	public static void main(String [] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter three points for a triangle: ");

	double exact1 = input.nextDouble();

	double yatch1 = input.nextDouble();

	double exact2 = input.nextDouble();

	double yatch2 = input.nextDouble();

	double exact3 = input.nextDouble();

	double yatch3 = input.nextDouble();

	double linear1 = exact2 - exact1;

	double distance1 = yatch2 - yatch1;

	double linearSquare1 = linear1 * linear1;

	double distanceSquare1 = distance1 * distance1;

	double linearDistance1 = linearSquare1 + distanceSquare1;

	double side1 = Math.sqrt(linearDistance1);

	double linear2 = exact2 - exact3;

	double distance2 = yatch2 - yatch3;

	double linearSquare2 = linear2 * linear2;

	double distanceSquare2 = distance2 * distance2;

	double linearDistance2 = linearSquare2 + distanceSquare2;

	double side2 = Math.sqrt(linearDistance2);

	double linear3 = exact3 - exact1;

	double distance3 = yatch3 - yatch1;

	double linearSquare3 = linear3 * linear3;

	double distanceSquare3 = distance3 * distance3;

	double linearDistance3 = linearSquare3 + distanceSquare3;

	double side3 = Math.sqrt(linearDistance3);

	double semi = side1 + side2 + side3;

	double semiSide = semi / 2;

	double semiSide1 = semiSide - side1;

	double semiSide2 = semiSide - side2;

	double semiSide3 = semiSide - side3;

	double semiSide4 = semiSide1 * semiSide2 * semiSide3;

	double area = Math.sqrt(semiSide * semiSide4);

	System.out.printf("The area of the triangle is %.1f", area);


	}


}



	

