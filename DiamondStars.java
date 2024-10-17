public class DiamondStars {
	public static void main(String... args){

		for(int row = 1; row <= 6; row++){
			for(int space = 6 - row; space > 0; space--){
				System.out.print("  ");

			}

			for(int star = 1; star <= 2 * row -1; star++){
			System.out.print("* ");

			}
			
			System.out.println();

		}

		for(int row = 5; row >= 1; row--){
			for(int space = 6 - row; space > 0; space--){
				System.out.print("  ");
			}

			for(int star = 1; star <= 2 * row-1; star++){

				System.out.print("* ");

			}

				System.out.println();

		}

	}

}