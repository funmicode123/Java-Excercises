public class BeautifyString{
   public static boolean checkFullStop(String example){
     return example.endsWith(".");

   }

   public static boolean checkCapitalLetter(String example){
     return Character.isUpperCase(example.charAt(0));

   }

    public static String checkString(String example){
	if (!checkFullStop(example)){
		example += ".";
	}
	if (!checkCapitalLetter(example)){
	   example = Character.toUpperCase(example.charAt(0)) + example.substring(1);
	}
        return example;

   }

}