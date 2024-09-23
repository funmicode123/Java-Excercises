public class BoardArray{
   public static void main(String[] args){
       char[][] roll1 = new char[3][3];
       char[][] roll2 = new char[3][3];
       char[][] roll3 = new char[3][3];

       roll1[0][0] = 'x';
       roll1[0][1] = 'o';
       roll1[0][2] = 'x';

       roll2[1][0] = 'o';
       roll2[1][1] = 'o';
       roll2[1][2] = 'o';

       roll3[2][0] = 'x';
       roll3[2][1] = 'o';
       roll3[2][2] = 'x';

       System.out.println(roll1[0][0] + " " + roll1[0][1]+ " " + roll1[0][2]);  
       System.out.println(roll2[1][0] + " " + roll2[1][1]+ " " + roll2[1][2]);  
       System.out.println(roll3[2][0] + " " + roll3[2][1]+ " " + roll3[2][2]);  


    }

}




