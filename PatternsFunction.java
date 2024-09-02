public class PatternsFunction {
	public static void main(String... args){
		printFirstPattern(5);
		
		printInvertedPattern(5);
	}
	public static void printFirstPattern(int row){
		for(int counter = 1; counter <= 5; counter++){
			for(int inner = 0; inner < counter; inner++){
			System.out.print("*");
			System.out.print(" ");

			}
			System.out.println();
		}

	}

	public static void printInvertedPattern(int row){		
		for(int counter = 5; counter > 0; counter--){
			for(int inner = 0; inner < counter - 1; inner++){
			System.out.print("* ");
			}
			System.out.println();
		}

	
	}

}