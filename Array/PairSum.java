package Array;
import java.util.Scanner;
import java.util.HashSet;

public class PairSum {

  public static void main(String[] a){

     Scanner sc =new Scanner(System.in);

     System.out.println("Enter the size of the array");
      int n = sc.nextInt();
      int[] arr = new int[n];

      System.out.println("Enter the elements of the array");
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

       int target = sc.nextInt();
      HashSet<Integer> set = new HashSet<>();

      for(int num : arr){
       
        int need = target - num;

        if(set.contains(need)){
          System.out.println("Pair found: " + num + " and " + need);
          return;
        }
        set.add(num);

      }
      System.out.println("No pair found that sums to " + target);

  }
  
}
