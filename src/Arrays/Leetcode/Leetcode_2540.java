package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_2540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size and elements of first array
        System.out.print("Enter size of nums1: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter elements of nums1 (sorted):");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }

        // Read size and elements of second array
        System.out.print("Enter size of nums2: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter elements of nums2 (sorted):");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }

        int num = -1; // default if no common value found
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                num = nums1[i];
                break;
            }
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("Minimum common value: " + num);

        scanner.close();
    }
}
