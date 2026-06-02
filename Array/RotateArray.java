package Array;
import java.util.Scanner;

public class RotateArray{
  public static void main(String[] a){

     Scanner sc  =new Scanner(System.in);

      System.out.println("Enter the size of the array");
      int n = sc.nextInt();

      int[] arr = new int[n];

      System.out.println("Enter the elements of the array");
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

      int k = sc.nextInt();
      int[] rotated = new int[n];

      for(int i=0 ; i<n ;i++){
        rotated[(i+k)%n] = arr[i];
      }

    for(int num: rotated){
        System.out.print(num + " ");
    }
  }
}