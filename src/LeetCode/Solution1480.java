package LeetCode;

public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;
    }
}
