import java.util.Scanner;

public class StudentGrade{

    public static void main (String... args){
        System.out.print("Enter the name of the student: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        int count = 0;

    System.out.print("Enter the grade in the range 0-100 or <Ctrl> z to terminate: ");

    while (input.hasNext()){
         int grade = input.nextInt();
         count++;

    if(grade < 0|| grade > 100){
        System.out.print("Invalid grade. Please enter a value btw 0 and 100");
        continue;
    }

         switch (grade / 10){
             case 9:
             case 10:
                 ++aCount;
                 break;
             case 8:
                 ++bCount;
                 break;
             case 7:
                 ++cCount;
                 break;
             case 6:
                 ++dCount;
                 break;
             default:
                 ++fCount;
                 break;
          }

       }
       System.out.printf("%nGrade report: %s%n", name);

       System.out.print("Number of students who received each grade: ");
       System.out.printf("A: %d%n", aCount); 

       System.out.printf("B: %d%n", bCount);

       System.out.printf("C: %d%n", cCount);

       System.out.printf("D: %d%n", dCount);

       System.out.printf("F: %d%n", fCount);


    }


}