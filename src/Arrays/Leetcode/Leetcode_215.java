package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_215 {
    public int findKthLargest(int[] nums, int k) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(nums);

        // Step 2: The kth largest element is at index (length - k)
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leetcode_215 sol = new Leetcode_215();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = sol.findKthLargest(nums, k);
        System.out.println("Output (" + k + "th largest element): " + result);

        sc.close();
    }
}