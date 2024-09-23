import java.util.Scanner;

public class TwelveDayTest {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the day of Christmas (1-12): ");
        int daysOfChristmas = input.nextInt();  
        
        switch (daysOfChristmas) {
            case 1: firstDay(); break;
            case 2: secondDay(); break;
            case 3: thirdDay(); break;
            case 4: fourthDay(); break;
            case 5: fifthDay(); break;
            case 6: sixthDay(); break;
            case 7: seventhDay(); break;
            case 8: eighthDay(); break;
            case 9: ninthDay(); break;
            case 10: tenthDay(); break;
            case 11: eleventhDay(); break;
            case 12: twelfthDay(); break;
            default: System.out.println("Invalid day. Please enter a number between 1 and 12.");
        }
    }

    public static void firstDay() {
        System.out.println("On the first day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "A partridge in a pear tree.");
    }

    public static void secondDay() {
        System.out.println("On the second day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void thirdDay() {
        System.out.println("On the third day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Three French hens,\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void fourthDay() {
        System.out.println("On the fourth day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Four calling birds,\n" +
                           "Three French hens,\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void fifthDay() {
        System.out.println("On the fifth day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
                           "Three French hens,\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void sixthDay() {
        System.out.println("On the sixth day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
                           "Three French hens,\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void seventhDay() {
        System.out.println("On the seventh day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Seven swans a-swimming,\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
                           "Three French hens,\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void eighthDay() {
        System.out.println("On the eighth day of Christmas,\n" +
                           "My true love gave to me\n" +
                           "Eight maids a-milking,\n" +
                           "Seven swans a-swimming,\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
                           "Three French hens,\n" +
                           "Two turtle doves,\n" +
                           "And a partridge in a pear tree.");
    }

    public static void ninthDay() {
        System.out.println("On the ninth day of Christmas,\n" +
			   "my true love gave to me\n" +
                           "Nine ladies dancing,\n" +
                           "Eight maids a-milking,\n" +
                           "Seven swans a-swimming,\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
			   "Three French hens,\n" +
                           "Two turtle doves,\n" +
               		   "And a partridge in a pear tree.");
    }

    public static void tenthDay() {
        System.out.println("On the tenth day of Christmas,\n" +
			   "my true love gave to me\n" +
                           "Ten lords a-leaping,\n" +
                           "Nine ladies dancing,\n" +
                           "Eight maids a-milking,\n" +
                           "Seven swans a-swimming,\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
			   "Three French hens,\n" +
                           "Two turtle doves,\n" +
               		   "And a partridge in a pear tree.");
    }

    public static void eleventhDay() {
        System.out.println("On the eleventh day of Christmas,\n" +
			   "my true love gave to me\n" +
                           "Eleven pipers piping,\n" +
                           "Ten lords a-leaping,\n" +
                           "Nine ladies dancing,\n" +
                           "Eight maids a-milking,\n" +
                           "Seven swans a-swimming,\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
			   "Three French hens,\n" +
                           "Two turtle doves,\n" +
               		   "And a partridge in a pear tree.");
    }

    public static void twelfthDay() {
        System.out.println("On the twelfth day of Christmas,\n" +
			  "my true love gave to me\n" +
                          "Twelve drummers drumming,\n" +
                           "Eleven pipers piping,\n" +
	                   "Ten lords a-leaping,\n" +
                           "Nine ladies dancing,\n" +
                           "Eight maids a-milking,\n" +
                           "Seven swans a-swimming,\n" +
                           "Six geese a-laying,\n" +
                           "Five golden rings,\n" +
                           "Four calling birds,\n" +
			   "Three French hens,\n" +
                           "Two turtle doves,\n" +
               		   "And a partridge in a pear tree.");
    }
}
