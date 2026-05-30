package Array;

import java.util.Scanner;

public class SecondLargestEle {

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

        for(int i = 0; i < size; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist.");
        } else {
            System.out.println("Second Largest Element = " + secondLargest);
        }

        sc.close();
    }
}