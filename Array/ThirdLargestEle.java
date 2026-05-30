package Array;

import java.util.Scanner;

public class ThirdLargestEle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i = 0; i < size; i++) {

            if(arr[i] > largest) {

                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = arr[i];

            } else if(arr[i] > secondLargest && arr[i] != largest) {

                thirdLargest = secondLargest;
                secondLargest = arr[i];

            } else if(arr[i] > thirdLargest &&
                      arr[i] != secondLargest &&
                      arr[i] != largest) {

                thirdLargest = arr[i];
            }
        }

        if(thirdLargest == Integer.MIN_VALUE) {
            System.out.println("Third largest element does not exist.");
        } else {
            System.out.println("Third Largest Element = " + thirdLargest);
        }

        sc.close();
    }
}