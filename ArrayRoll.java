import java.security.SecureRandom;

public class ArrayRoll{
    public static void main(String... args){
        SecureRandom randomNum = new SecureRandom();
        int[] times = new int[7];

        for (int roll = 1; roll <= 100_000; roll++){
            ++times[1 + randonNum.nextInt(6)];

        }
        System.out.printf("%s\t%s%n", "Face", "Times");
        for (int face =1; face < times.length; face++){
            System.out.printf("%4d\t%d%n", face, times[face]);

        }
    }


}