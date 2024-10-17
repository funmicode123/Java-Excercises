import java.util.Arrays;

public class ArraySum2 {
    public static void main(String... args) {
        int[] numbers = {5, 6, 1, 1, 11};
        int totalSum = 0;
        
        for (int number : numbers) {
            totalSum += number;
        }
        

        int[] sums = new int[numbers.length];
        for (int index = 0; index < numbers.length; index++) {
            sums[index] = totalSum - numbers[index];
        }
        
        System.out.printf("%s%n", Arrays.toString(sums));

        int minimum = sums[0];
        int maximum = sums[0];
        
        for (int sum : sums) {
            if (sum < minimum) {
                minimum = sum;
            }
            if (sum > maximum) {
                maximum = sum;
            }
        }

        int[] result = {minimum, maximum};
        System.out.println(Arrays.toString(result));
    }
}
