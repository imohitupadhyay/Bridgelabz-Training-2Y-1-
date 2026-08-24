package Arrays.Leetcode;

import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] answer = new int[n];


        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }


        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }


        for (int i = 0; i < n; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}