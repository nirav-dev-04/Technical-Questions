// Remove Duplicate Characters from a String
// for this used the linked hashset to store the characters and then we will check if the character is already present in the set or not if it is not present then we will add it to the set and also add it to the result string

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RDVS{
   public static void main(String[] a){
     Scanner sc = new Scanner(System.in);

      System.out.println("Enter a string:");
      String str = sc.nextLine();

      LinkedHashSet<Character> set  =new LinkedHashSet<>();

      // first convert the string to a character array

      for(char ch : str.toCharArray()){
        set.add(ch);
      }
     // used the StringBuilder to store the result string because it is more efficient than using the string concatenation operator
      StringBuilder result = new StringBuilder();

      for(char ch : set){
        result.append(ch);
      }

      System.out.println("String after removing duplicate characters: " + result.toString());
      sc.close();
   }
}
