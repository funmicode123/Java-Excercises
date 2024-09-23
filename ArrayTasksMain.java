import java.util.ArrayList;
import java.util.List;

public class ArrayTasksMain{
	public static void main(String... args){
		int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		char[] sets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		int number = 23456;
		
		for(int index = 0; index < values.length; index++){
			System.out.printf("%d%s ", values[index], (index < values.length - 1) ? "," : "");
		}

		System.out.println();
		int largest = ArrayTasks.largestNumber(values);
		System.out.println("Largest number: " + largest);

		ArrayTasks.reverseArray(values);
		System.out.print("Reversed array: ");
		for(int index = 0; index < values.length; index++){
			System.out.printf("%d%s ", values[index], (index < values.length - 1) ? "," : "");
		}
		System.out.println();

		int elementToFind = 30;
		boolean isPresent = ArrayTasks.isElementPresent(values, elementToFind);
		System.out.println("Is " + elementToFind + " present?: " + isPresent);

		System.out.print("Elements at odd positions: ");
		ArrayTasks.printOddPositionElements(values);

		System.out.print("Elements at even positions: ");
		ArrayTasks.printEvenPositionElements(values);

		int listTotal = ArrayTasks.computeTotal(values);
		System.out.println("The total numbers in the array list: " + listTotal);

		String stringElement = String.valueOf(values[5]);
		System.out.println("Is " + stringElement +  " a palindrome?: " + ArrayTasks.isStringPalindrome(stringElement));

		int listSum = ArrayTasks.computeSumWhile(values);
		System.out.println("The sum numbers in the array list using while loop: " + listSum);

		int listDo = ArrayTasks.computeSumDo(values);
		System.out.println("The sum numbers in the array list using do loop: " + listDo);

		System.out.print("The merged list: ");
		List<String> mergedResult = ArrayTasks.concatenateSets(values, sets);
		System.out.println(mergedResult);

		List<String> mergedList = ArrayTasks.mergeAlternating(values, sets);
		System.out.println("The alternating elements list: " + mergedList);

		List<Integer> digits = ArrayTasks.extractDigits(number);
        	System.out.println("Digits of " + number + ": " + digits);
	}


}
