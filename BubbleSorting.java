import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] inputArr = {5, 13, 3, 8, 4, 2};  

        bubbleSort(inputArr);

        System.out.println("Sorted Array: " + Arrays.toString(inputArr));
    }

    public static void bubbleSort(int[] inputArr) {
        boolean swapped;
        do {
            swapped = false;
            for (int index = 0; index < inputArr.length - 1; index++) {
                
                if (inputArr[index] > inputArr[index + 1]) {
                    
                    inputArr[index] = inputArr[index] + inputArr[index + 1]; 
                    inputArr[index + 1] = inputArr[index] - inputArr[index + 1]; 
                    inputArr[index] = inputArr[index] - inputArr[index + 1];
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
