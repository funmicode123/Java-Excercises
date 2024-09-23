import java.util.Scanner;

public class VolumeTriangle {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter length of the sides and height of the equilateral triangle: ");

	double length = input.nextDouble();

	double height = input.nextDouble();

	double lengthOfsides = Math.pow(length, 2) / 4;

	double area = lengthOfsides * 1.732;

	System.out.printf("The area is %.2f%n", area);

	double volume = area * height;

	System.out.printf("The volume of the Triangular prism is %.2f", volume);



	}


}