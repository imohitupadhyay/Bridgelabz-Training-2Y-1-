package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_977 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Read the array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Step 1: Square each element in-place
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the array in ascending order
        Arrays.sort(nums);

        // Output the result
        System.out.println("Sorted Squares: " + Arrays.toString(nums));

        scanner.close();
    }
}