package Array;

import java.util.*;

public class RemoveDuplicatesUnsorted {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");

        for(int num : set) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}