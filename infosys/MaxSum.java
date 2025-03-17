import java.util.*;

public class MaxSum {
    // Helper function to perform Kadane’s Algorithm
    static int[] kadaneMaxSubarray(int[] arr) {
        int maxSum = arr[0], currSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currSum + arr[i] > arr[i]) {
                currSum += arr[i];
            } else {
                currSum = arr[i];
                tempStart = i;
            }

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        return new int[]{maxSum, start, end};
    }

    // Helper function to perform Kadane’s Algorithm for min sum
    static int kadaneMinSubarray(int[] arr) {
        int minSum = arr[0], currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.min(arr[i], currSum + arr[i]);
            minSum = Math.min(minSum, currSum);
        }
        return minSum;
    }

    public static void findMaxCircularSubarray(int[] arr) {
        int n = arr.length;

        // Find max subarray sum using normal Kadane's Algorithm
        int[] kadaneResult = kadaneMaxSubarray(arr);
        int maxKadaneSum = kadaneResult[0];
        int start = kadaneResult[1];
        int end = kadaneResult[2];

        // Find total sum and min subarray sum
        int totalSum = 0;
        for (int num : arr) totalSum += num;
        int minSubarraySum = kadaneMinSubarray(arr);

        // Calculate max circular subarray sum
        int maxCircularSum = totalSum - minSubarraySum;

        // Handle the case where all numbers are negative
        if (maxCircularSum == 0) {
            printSubarray(arr, start, end);
            System.out.println(maxKadaneSum);
            return;
        }

        // Choose the better option
        if (maxKadaneSum >= maxCircularSum) {
            printSubarray(arr, start, end);
            System.out.println(maxKadaneSum);
        } else {
            // Find circular subarray
            int circularStart = (end + 1) % n;
            int circularEnd = (start - 1 + n) % n;
            printCircularSubarray(arr, circularStart, circularEnd);
            System.out.println(maxCircularSum);
        }
    }

    // Helper function to print subarray
    static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i < end ? ", " : "\n"));
        }
    }

    // Helper function to print circular subarray
    static void printCircularSubarray(int[] arr, int start, int end) {
        int n = arr.length;
        int i = start;
        while (true) {
            System.out.print(arr[i] + (i != end ? ", " : "\n"));
            i = (i + 1) % n;
            if (i == (end + 1) % n) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int[] arr = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        findMaxCircularSubarray(arr);
        scanner.close();
    }
}
