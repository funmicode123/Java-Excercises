public class SumArray{
	public static void main(String... args){
		int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int total = 0;

		System.out.printf("%s\t%s%n", "Index", "Values");

		for(int count = 0; count< values.length; count++){
			total += values[count];
		
			System.out.printf("%5d\t%5d%n", count, values[count]);

		}
			System.out.printf("Total of the array elements: %d%n", total);
	}

}