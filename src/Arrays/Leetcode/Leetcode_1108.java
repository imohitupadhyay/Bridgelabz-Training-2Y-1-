package Arrays.Leetcode;
import java.util.Scanner;

public class Leetcode_1108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String address = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }

        // "num" used to count how many parts (segments) the IP has
        int num = 1; // starts at 1 since dots divide segments
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                num++;
            }
        }

        System.out.println("Defanged IP: " + result);
        System.out.println("Number of segments: " + num);

        scanner.close();
    }
}
