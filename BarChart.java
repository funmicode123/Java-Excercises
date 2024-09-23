public class BarChart{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        System.out.println("Grade distribution");

        for(int count = 0; count< array.length; count++){
            if (count == 10){
                System.out.printf("%5d: ", 100);
	    }
            else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for (int asterisks = 0; asterisks < array[count]; asterisks++){
            System.out.print("*");

            }
            System.out.println();
	}
    }


}