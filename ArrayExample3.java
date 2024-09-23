public class ArrayExample3{
	public static void main(String... args){
		int[] values = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

		System.out.printf("%s\t%s%n", "Index", "Values");


		for(int count = 0; count< values.length; count++){
			System.out.printf("%5d\t%5d%n", count, values[count]);
		}
	}

}