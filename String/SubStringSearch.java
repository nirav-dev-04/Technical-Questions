import java.util.Scanner;

public class SubStringSearch{
   public static void main(String[] a){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the main String : ");
    String str = sc.nextLine();

    System.out.println("Enter the Sub String : ");
    String subStr = sc.nextLine();

    int index = str.indexOf(subStr);

    if(index != -1){
      System.out.println("Sub String found at index : " + index);
    }

    else{
      System.out.println("Sub String not found in the main String.");
    }
    sc.close();

   }
}