import java.util.Scanner;
public class CountOccurrencesofCharacter {
  
   public static void main(String[] a){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the String : ");
     String str = sc.nextLine();

      System.out.println("Enter the target character : ");
      char target = sc.next().charAt(0);

      // convert to allthe characters to lower case

      str = str.toLowerCase();
      target = Character.toLowerCase(target);

      int count = 0;

      for(int i=0 ; i<str.length(); i++){
           if(str.charAt(i) == target){
             count++;
           } 

      }
      System.out.println("The number of occurrences of character '" + target + "' in the string is : " + count);
      sc.close();
   }
}
