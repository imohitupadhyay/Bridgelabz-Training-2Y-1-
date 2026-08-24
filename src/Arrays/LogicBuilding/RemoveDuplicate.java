package Arrays.LogicBuilding;

import java.util.Scanner;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int[] uniqueArr = new int[size];
        int uniqueCount = 0;
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        System.out.print("Unique numbers: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
        scanner.close();
    }
}   