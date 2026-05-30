public class CheckRotation {
   public static boolean areRotations(String str1, String str2) {
      if (str1.length() != str2.length()) {
         return false;
      }
      String temp = str1 + str1;
      return temp.contains(str2);
   }
   public static void main(String[] a){
      String str1 = "hello";
      String str2 = "lohel";

      if (areRotations(str1, str2)) {
         System.out.println("The strings are rotations of each other.");
      } else {
         System.out.println("The strings are not rotations of each other.");
      }
   }
}
