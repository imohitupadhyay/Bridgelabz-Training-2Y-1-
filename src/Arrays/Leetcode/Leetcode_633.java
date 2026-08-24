package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_633 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        boolean result = false;

        for (long a = 0; a * a <= c; a++) {
            int bSquare = c - (int)(a * a);
            int b = (int) Math.sqrt(bSquare);

            if (a * a + b * b == c) {
                result = true;
                break;
            }
        }

        System.out.println("Output: " + result);

        scanner.close();
    }
}
