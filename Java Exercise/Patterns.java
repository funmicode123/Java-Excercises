public class Patterns {
	public static void main(String... args){

		for(int counter = 1; counter <= 5; counter++){
			for(int inner = 0; inner < counter; inner++){
			System.out.print("*");
			System.out.print(" ");

			}

			System.out.println();

		}

			
		for(int counter = 5; counter > 0; counter--){
			for(int inner = 0; inner < counter - 1; inner++){
			System.out.print("* ");
			}

			System.out.println();

		}

	}

}