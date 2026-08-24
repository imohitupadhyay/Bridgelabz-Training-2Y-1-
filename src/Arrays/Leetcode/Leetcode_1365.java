package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_1365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] ans = new int[nums.length];

        // Compare each element with every other element using if
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        System.out.println("Output: " + Arrays.toString(ans));

        scanner.close();
    }
}
