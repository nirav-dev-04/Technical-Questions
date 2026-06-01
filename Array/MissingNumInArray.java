package Array;

public class MissingNumInArray {
    public static void main(String[] a){
        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1; // Since one number is missing

        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers

        int arrSum = 0;

        for(int num : arr) {
            arrSum += num;
        }

        int missingNum = totalSum - arrSum;

        System.out.println("Missing number: " + missingNum);
    }
}
