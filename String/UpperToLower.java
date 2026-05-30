import java.util.Scanner;
public class UpperToLower {
  public static void main(String[] a){
  Scanner sc = new Scanner(System.in);
 
  System.out.println("Enter a string:");
  String str = sc.nextLine();

  String result = str.toLowerCase();
  String result1 = str.toUpperCase();

  System.out.println("String after converting to lowercase: " + result);
  System.out.println("String after converting to uppercase: " + result1);
  
  sc.close();
    }
}
