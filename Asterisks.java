public class Asterisks {
	public static void main(String... args){
	 String input = "* ";

		for( int row = 1; row <= 6; row++){
			for(int star = 0; star < row; star++){
				System.out.print(input);

			}

			System.out.println();

		}

			System.out.println();


		for(int row = 6; row > 0; row--){

			for(int star = 0; star <= row - 1; star++) {
				System.out.print(input);
				

			}

				System.out.println();

		}

		for(int row = 6; row >= 1; row--){
			for(int space = 0; space < 6 - row; space++){
				System.out.print("  ");
			}

			for(int star = 1; star <= row; star++){

				System.out.print("* ");

			}

				System.out.println();

		}
			System.out.println();

		for(int row = 6; row >= 1; row--){
			for(int space = 0; space < row - 1; space++){
				System.out.print("  ");

			}

			for(int star = 1; star <= 6 - row + 1; star++){
			System.out.print("* ");

			}
			
			System.out.println();

		}

	}


}