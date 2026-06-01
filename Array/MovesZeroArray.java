package Array;

public class MovesZeroArray {
  
   public static void main(String[] a){
     
     int[] arr = {0, 1, 0, 3, 12};

     int n = arr.length;

     int index = 0; // Pointer for the next non-zero element

     for(int i = 0; i < n; i++){
        if(arr[i] != 0){
           arr[index] = arr[i]; // Move non-zero element to the front
           index++;
        }
     }

     // Fill remaining elements with zero
     while(index < n){
        arr[index] = 0;
        index++;
     }

      System.out.println("Array after moving zeros to the end:");
      for(int num : arr){
         System.out.print(num + " ");
      }
   }
}
