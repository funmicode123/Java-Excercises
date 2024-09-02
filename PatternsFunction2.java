import java.util.Scanner;
public class PatternsFunction2 {
	public static void printTriangle(int row){
		printFirstPattern(row);
		printInvertedPattern(row);
	}

	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of starts: ");
		int request = input.nextInt();
	 	printTriangle(request);
	}

	public static void printFirstPattern(int row){
		for(int counter = 1; counter <= row; counter++){
			for(int inner = 0; inner < counter; inner++){
			System.out.print("*");
			System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void printInvertedPattern(int row){		
		for(int counter =row; counter > 0; counter--){
			for(int inner = 0; inner < counter - 1; inner++){
			System.out.print("* ");
			}
			System.out.println();
		}

	
	}

}