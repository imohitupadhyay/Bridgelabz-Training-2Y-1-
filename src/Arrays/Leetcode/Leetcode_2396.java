package Arrays.Leetcode;

class Leetcode_2396 {
    public boolean isStrictlyPalindromic(int n) {
        // Mathematically, for any integer n >= 4,
        // the representation of n in base (n - 2) is always "12",
        // which is never a palindrome. Therefore, it is always false.
        return false;
    }

    public static void main(String[] args) {
        Leetcode_2396 sol = new Leetcode_2396();

        int n1 = 9;
        int n2 = 4;

        System.out.println("Input: " + n1 + " -> Output: " + sol.isStrictlyPalindromic(n1));
        System.out.println("Input: " + n2 + " -> Output: " + sol.isStrictlyPalindromic(n2));
    }
}