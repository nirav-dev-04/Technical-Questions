public class ReverseString {
   public static void main(String[] args){
      String str= "Hello World";
      String reversedStr = new StringBuilder(str).reverse().toString();
      System.out.println("Reversed String: " + reversedStr);

   } 
  }


  // mannual way to reverse a string

//   public class Main {
//     public static void main(String[] args) {
//         String str = "hello";
//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i);
//         }

//         System.out.println(rev);
//     }
// }


