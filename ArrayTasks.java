import java.util.ArrayList;
import java.util.List;

public class ArrayTasks{

	public static int largestNumber(int[] values){
		int largest = values[0];
		for(int index = 1; index < values.length; index++){
			if (largest < values[index]){
				largest = values[index];
			}

		}
		return largest;

	}

	public static void reverseArray(int[] values){
		int start = 0;
		int stop = values.length - 1;
		while (start < stop){
			int swap = values[start];
			values[start] = values[stop];
			values[stop] = swap;

			start++;
			stop--;

		}


	}

	public static boolean isElementPresent(int[] values, int element){
		for (int index = 0; index < values.length; index++){
			if (values[index] == element){
				return true;

			}
		}
		return false;
		

	}

	public static void printOddPositionElements(int[] values){
		for (int index = 0; index < values.length; index++){
			if (index % 2 == 1)
				System.out.print(values[index] + " ");


		}
		System.out.println();

	}
	
	public static void printEvenPositionElements(int[] values){
		for (int index = 0; index < values.length; index++){
			if (index % 2 == 0)
				System.out.print(values[index] + " ");


		}
		System.out.println();

	}

	public static int computeTotal(int[] values){
		int total = 0;
		for (int index = 0; index < values.length; index++){
			total += values[index];

		}
		return total;

	}

	public static boolean isStringPalindrome(String string){
		string = string.toLowerCase();
		int start = 0;
		int stop = string.length() - 1;	
	
		while (start < stop){
			if (string.charAt(start) != string.charAt(stop)){
				return false;
			}

			start++;
			stop--;
			
		}
		return true;
		

	}

	public static int computeSumWhile(int[] values){
		int sum = 0;
		int index = 0;
		while ( index < values.length){
			sum += values[index];
			index++;
		}
		return sum;

	}

	public static int computeSumDo(int[] values){
		int sum = 0;
		int index = 0;
		do {
			sum += values[index];
			index++;
		}
		while ( index < values.length);

		return sum;

	}

	public static List<String> concatenateSets(int[] values, char[] sets){
		List<String> mergedList = new ArrayList<>();
		for(int value : values){
			mergedList.add(String.valueOf(value));

		}
		for(char set : sets){
			mergedList.add(String.valueOf(set));
		
		}
		return mergedList;

	}

	public static List<String> mergeAlternating(int[] values, char[] sets){
		List<String> mergedList = new ArrayList<>();
		int minLength = Math.min(values.length, sets.length);
		for (int index = 0; index < minLength; index++){
			mergedList.add(String.valueOf(values[index]));
			mergedList.add(String.valueOf(sets[index]));
		}

        	return mergedList;
	}

	public static List<Integer> extractDigits(int number){
		List<Integer> digits = new ArrayList<>();
		if (number < 0){
			number = -number;
		}

		while(number > 0){
			digits.add(0, number % 10);
			number /= 10;
		}

		return digits;

	}
}