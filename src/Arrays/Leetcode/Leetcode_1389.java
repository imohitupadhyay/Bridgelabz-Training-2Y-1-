package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leetcode_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }

    public static void main(String[] args) {
        Leetcode_1389 q = new Leetcode_1389();

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] result = q.createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }
}