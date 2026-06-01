package Array;

import java.util.HashSet;

public class RemovedDuplicatesNumber {

  public static void main(String[] a) {
    int[] arr = { 2, 3, 4, 1, 5 };

    // create hashset

    HashSet<Integer> set = new HashSet<>();

    for (int num : arr) {
      if (set.contains(num)) {
        System.out.println("Duplicate number: " + num);
        return;
      }

      set.add(num);

    }

  }
}
