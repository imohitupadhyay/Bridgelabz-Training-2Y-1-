package Arrays.Leetcode;
public class Leetcode_414 {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long current = num;

            // Skip duplicate values
            if ((first != null && current == first) ||
                    (second != null && current == second) ||
                    (third != null && current == third)) {
                continue;
            }

            // Shift maximums when a larger number is found
            if (first == null || current > first) {
                third = second;
                second = first;
                first = current;
            } else if (second == null || current > second) {
                third = second;
                second = current;
            } else if (third == null || current > third) {
                third = current;
            }
        }

        // Return third max if it exists, otherwise return absolute max
        return third == null ? first.intValue() : third.intValue();
    }

    // Main method added for running locally in IntelliJ
    public static void main(String[] args) {
        Leetcode_414 solution = new Leetcode_414();

        // Test Case 1: [3, 2, 1] -> Output: 1
        int[] nums1 = {3, 2, 1};
        System.out.println("Result 1: " + solution.thirdMax(nums1));

        // Test Case 2: [1, 2] -> Output: 2
        int[] nums2 = {1, 2};
        System.out.println("Result 2: " + solution.thirdMax(nums2));

        // Test Case 3: [2, 2, 3, 1] -> Output: 1
        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Result 3: " + solution.thirdMax(nums3));
    }
}