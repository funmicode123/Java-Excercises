public class EvenArray{
	public static void main(String... args){
		final int VALUES_LENGTH = 10;
		int[] values = {VALUES_LENGTH};

		for(int count = 0; count< values.length; count++){
			values[count] = 2 + 2 * count;

		}

		System.out.printf("%s\t%s%n", "Index", "Values");


		for(int count = 0; count< values.length; count++){
			System.out.printf("%5d\t%5d%n", count, values[count]);
		}
	}

}