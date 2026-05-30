import java.util.Scanner;
public class StringRotation {
   public static void main(String[] a){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the first String : ");
    String str1 = sc.nextLine();

    System.out.println("Enter the second String : ");
    String str2 = sc.nextLine();

    if(str1.length() == str2.length() && (str1+str1).contains(str2)){
      System.out.println("The two strings are rotations of each other.");
    }
    else{
      System.out.println("The two strings are not rotations of each other."); 
    }
    sc.close();
   }
   
}
