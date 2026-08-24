package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

class Leetcode_1929 {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];         // First half
            ans[i + n] = nums[i];     // Second half
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Leetcode_1929 sol = new Leetcode_1929();

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sol.getConcatenation(nums);
        System.out.println("Output: " + Arrays.toString(result));

        sc.close();
    }
}
