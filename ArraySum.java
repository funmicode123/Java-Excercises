import java.util.Arrays;

public class ArraySum{
	public static void main(String... args){

		int[] numbers = {5, 6, 1, 1, 11};
		int[] sums =new int[numbers.length];
		int store ;
		int sum;
		
		for(int index = 0; index < numbers.length; index++){
			store = numbers[index];
			sum = 0;
			for(int count =0; count < numbers.length; count++){
				
				if (numbers[count] != store)
					sum += numbers[count];


			}
			sums [index] = sum;

		}

		System.out.printf("%s%n", Arrays.toString(sums));

	int[] result =new int[2];
	
	int minimum = sums[0];
	int maximum = sums[0];
	for(int counter = 0; counter < sums.length; counter++){
		
	if(maximum < sums[counter]){
		maximum = sums[counter];
	}

	if(minimum > sums[counter]){
		minimum = sums[counter];
	}

	result[0] = minimum;
	result[1] = maximum;

	}

	System.out.println(Arrays.toString(result));


	}
	

}