import java.util.Arrays;

public class ClassDrill {

    public static void main(String... args) {

        int[] values = {2, 2, 3, 3, 5, 2};


        int mostOccurredNum = mostOccurred(values);
        System.out.println("Most occurred: " + mostOccurredNum);

    }

    public static int mostOccurred(int[] values){
	int mostOccurred = values[0];
        for(int index = 0; index < values.length; index++){
            if (mostOccurred == values[index])
                mostOccurred = values[index];

        }
        return mostOccurred;
    }


}
