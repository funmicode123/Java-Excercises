import java.util.Arrays;

public class MinMax {

    public static void main(String... args) {

        int[] values = {5, 10, 2, 1, 7};
        final int MIN_MAX = 2;
        int[] minMax = new int[MIN_MAX];


        minMax[0] = minimum(values);
        minMax[1] = maximum(values);


        System.out.println("Minimum & Maximum: " + Arrays.toString(minMax));

	        
    }

   

    public static int minimum(int[] values) {
        int minimum = values[0];
        for (int index = 1; index < values.length; index++) { 
            if (minimum > values[index]) {
                minimum = values[index];
            }
        }
        return minimum;
    }


    public static int maximum(int[] values) {
        int maximum = values[0];
        for (int index = 1; index < values.length; index++) {
            if (maximum < values[index]) {
                maximum = values[index];
            }
        }
        return maximum;
    }

   
}
