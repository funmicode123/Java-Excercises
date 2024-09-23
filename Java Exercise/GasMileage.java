import java.util.Scanner;

public class GasMileage {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter the miles for the trip (or -1 to end): ");
            int miles = input.nextInt();
            if (miles == -1) {
                break;
            }
            totalMiles += miles;

            System.out.print("Enter the gallons for the trip: ");
            int gallons = input.nextInt();
            totalGallons += gallons;
        }

        if (totalGallons != 0) {
            float totalAverage = (float) totalMiles / totalGallons;
            System.out.printf("The average miles per gallon is: %.2f", totalAverage);
        } 
	else {
            System.out.println("No gallons entered, cannot calculate average.");
        }

        }
}
