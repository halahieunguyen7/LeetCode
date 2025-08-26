package LeetCode;

import java.util.Arrays;

public class SolutionRemoveElement {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            while (nums[end] == val) {
                end--;
                if (start > end) break;
            }
            if (end < 0 || start > end) {
                break;
            }
            if (nums[start] == val) {
                nums[start] = nums[start] - nums[end] ;
                nums[end] = nums[start] + nums[end];
                nums[start] = nums[end] - nums[start];
                end--;
            }

            start++;
        }
        return start;
    }
}
