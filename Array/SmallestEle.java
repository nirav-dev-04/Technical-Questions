package Array;

import java.util.Scanner;

public class SmallestEle {
  public static void main(String[] a){
     Scanner sc = new Scanner(System.in);

      System.out.println("Enter the size of the array:");
      int size = sc.nextInt();

      int[] arr = new int[size];

      System.out.println("Enter the elements of the array:");

      for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
      }

      int smallest = arr[0];

      for(int i=1 ; i<size ; i++){
        if(arr[i] < smallest){
          smallest = arr[i];
        }
      }
      System.out.println("The smallest element in the array is: " + smallest);
      sc.close();
  }
}
