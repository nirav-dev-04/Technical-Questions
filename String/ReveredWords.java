// reverse word in the sentence
// Input:  "I love Java"
// Output: "Java love I"

import java.util.*;
import java.util.Scanner;
public class ReveredWords {
   public static void main(String[] a){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string:");
    String str = sc.nextLine();

    List<String> words = Arrays.asList(str.split(" "));
    Collections.reverse(words);
    String result = String.join(" ", words);
    System.out.println("Reversed string: " + result);
    
      sc.close();
   }
   
}
