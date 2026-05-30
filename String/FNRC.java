// First Non-Repeating Character
public class FNRC{
   public static void main(String[] a){
      String str = "aabbccdeff";

      int[] count = new int[256]; // assuming ASCII character set

      // count the frequency of each character in the string
      for(char ch : str.toCharArray()){
         count[ch]++;
      }

      for(char ch : str.toCharArray()){
         if(count[ch] == 1){
            System.out.println("First non-repeating character: " + ch);
            return;
         }
      }
      System.out.println("No non-repeating character found.");
   }
}