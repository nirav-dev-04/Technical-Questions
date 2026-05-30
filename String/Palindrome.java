// for the palindrome used the 2-pointer approach
// ex:- "madam" -> this is the palindrome string
import  java.util.Scanner; 
public class Palindrome{
    public static void main(String[] a){
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter the String");

          String str = sc.nextLine();

          // used the positions
          int left = 0;
          int right = str.length() - 1;
          boolean isPalindrome = true;

          while(left<right){
             if(str.charAt(left) != str.charAt(right)){
              isPalindrome = false;
              break;
             }
             left++;
             right--;

          }
          System.out.println(isPalindrome ? "The string is a palindrome" : "The string is not a palindrome");
        }
    }
}