import java.util.Scanner;
public class RSUserInput {
    public static void main(String[] a){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse: ");
            String str = sc.nextLine();

            String reversedStr = new StringBuilder(str).reverse().toString();
            System.out.println("Reversed String: " + reversedStr);
        }
    }
} 
