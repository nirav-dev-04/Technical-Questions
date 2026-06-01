// this program is used to sort the array in ascending order using bubble sort algorithm
package Array;
public class SortArray{
   public static void main(String[] a){
     
     int[] arr = {5, 2, 8, 1, 3};

     int n = arr.length;

     for(int i= 0 ; i<n-1 ; i++){
        for(int j = 0 ; j<n-1-i ;j++){
           if(arr[j]>arr[j+1]){
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
           }
        }
     }
      System.out.println("Sorted Array:");
      for(int num : arr){
         System.out.print(num + " ");
      }
   }
}

// using built in functions to sort the array
// package Array;
// import java.util.Arrays;

// public class SortArray{
//    public static void main(String[] a){
     
//      int[] arr = {5, 2, 8, 1, 3};

//      Arrays.sort(arr);

//       System.out.println("Sorted Array:");
//       for(int num : arr){
//          System.out.print(num + " ");
//       }
//    }
// }