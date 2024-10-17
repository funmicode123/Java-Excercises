public class ClassWork{

	public static void main(String... args){

		int[] values = {5, 10, 2, 1, 7};
		final int LOWEST_LARGEST = 2;
		int[] lowestLargest = new int[LOWEST_LARGEST];

		int[] valuesTotal = sumElements(values);

		for(int index = 0; index < valuesTotal.length; index++){
			System.out.printf("%d%s ", valuesTotal[index], (index < valuesTotal.length - 1) ? "," : "");
		}

		lowestLargest[0] = lowestNumber(valuesTotal);
		lowestLargest[1] = largestNumber(valuesTotal);
		
		
	}	
	public static int[] sumElements(int[] values){
		int counter;
		int[] finalValues = new int[values.length];
		int[] copy = new int[values.length -1];
		for (int index = 0; index < values.length; index++){
			counter = 0;
			int total = 0;
	  		for (int count =0; count < values.length; count++){
				if (values[index] == values[count]){
					continue;
				}
				else{
					copy[counter] = values[count];
					counter++;
				}
			}
			for (int num = 0; num < copy.length; num++){
				total+= copy[num];
			}
			finalValues[index] = total;	
		}
		return finalValues;
		
	}

	public static int lowestNumber(int[] valuesTotal){
		int lowest = valuesTotal[0];
		for(int index = 1; index < valuesTotal.length; index++){
			if (lowest > valuesTotal[index]){
				lowest = valuesTotal[index];
			}

		}
		return lowest;

	}

	public static int largestNumber(int[] valuesTotal){
		int largest = valuesTotal[0];
		for(int index = 1; index < valuesTotal.length; index++){
			if (largest < valuesTotal[index]){
				largest = valuesTotal[index];
			}

		}
		return largest;

	}

	

 

	

}



