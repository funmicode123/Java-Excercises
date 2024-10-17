public class NumberTriangle {
    public static void main(String[] args) {
        int height = 8; 
        
        for (int row = 1; row <= height; row++) {

            for (int space = height; space > row; space--) {
                System.out.print("      ");        
            }
              

            for (int number = 1; number <= row; number++) {
		System.out.print(number + "  ");    
            } 

            for (int number = row - 1; number >= 1; number--) {
                System.out.print(number + "   ");
                                         
            }
            System.out.println();  
        }
    }
}
