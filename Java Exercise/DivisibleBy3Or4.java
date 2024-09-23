public class DivisibleBy3Or4 {
    public static void main(String... args){
		
	int lineCounter = 0;

    	for(int number = 100; number <= 200; number++){

		if (number % 3 == 0 || number % 4 == 0){


			System.out.print(number + " ");
			lineCounter++;

			if (lineCounter == 10){
			System.out.println();
			lineCounter = 0;
			}
				
		}

			
	}	

   }
}
