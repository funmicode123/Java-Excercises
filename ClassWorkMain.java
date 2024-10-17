import java.util.Arrays;

public class ClassWorkMain {

    public static void main(String... args) {

        int[] values = {5, 10, 2, 1, 7};
        final int LOWEST_LARGEST = 2;
        int[] lowestLargest = new int[LOWEST_LARGEST];


        int[] valuesTotal = sumElements(values);


        for (int index = 0; index < valuesTotal.length; index++) {
            System.out.printf("%d%s ", valuesTotal[index], (index < valuesTotal.length - 1) ? "," : "");
        }
        System.out.println(); 

        lowestLargest[0] = lowestNumber(valuesTotal);
        lowestLargest[1] = largestNumber(valuesTotal);


        System.out.println("Lowest & Largest: " + Arrays.toString(lowestLargest));

	int[] valuesSquared = squareInteger(values);

	Arrays.sort(valuesSquared);

	System.out.println("Squared values in ascending order: ");
	for (int index = 0; index < valuesSquared.length; index++) {
            System.out.printf("%d%s ", valuesSquared[index], (index < valuesSquared.length - 1) ? "," : "");
        }
        System.out.println();
        
    }

    public static int[] sumElements(int[] values) {
        int[] finalValues = new int[values.length];

        for (int index = 0; index < values.length; index++) {
            int total = 0;
            for (int count = 0; count < values.length; count++) {
                if (count != index) {
                    total += values[count];
                }
            }
            finalValues[index] = total;
        }
        return finalValues;
    }


    public static int lowestNumber(int[] valuesTotal) {
        int lowest = valuesTotal[0];
        for (int index = 1; index < valuesTotal.length; index++) { 
            if (lowest > valuesTotal[index]) {
                lowest = valuesTotal[index];
            }
        }
        return lowest;
    }


    public static int largestNumber(int[] valuesTotal) {
        int largest = valuesTotal[0];
        for (int index = 1; index < valuesTotal.length; index++) {
            if (largest < valuesTotal[index]) {
                largest = valuesTotal[index];
            }
        }
        return largest;
    }

    public static int[] squareInteger(int[] values){
        int[] squaredValues = new int[values.length];

        for (int index = 0; index < values.length; index++) {
            squaredValues[index] = values[index] * values[index];

        }
        return squaredValues;



    }

}
