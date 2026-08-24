package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_1295 {
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

        // Count elements with an even number of digits using nums[i]
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] >= 10 && nums[i] <= 99) ||
                    (nums[i] >= 1000 && nums[i] <= 9999) ||
                    (nums[i] == 100000)) {
                count++;
            }
        }

        System.out.println("Output: " + count);

        scanner.close();
    }
}