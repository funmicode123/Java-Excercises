public class ArrayExample2{
	public static void main(String... args){
		int[] value = new int[10];

		System.out.printf("%s\t%s%n", "Index", "Value");


		for(int count = 0; count< value.length; count++){
			System.out.printf("%5d\t%5d%n", count, value[count]);
		}
	}

}