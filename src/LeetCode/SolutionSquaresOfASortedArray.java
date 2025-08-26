package LeetCode;

import java.util.Arrays;

public class SolutionSquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int endNegative, startPositive;
        startPositive = nums.length;
        endNegative = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > -1) {
                startPositive = i;
                endNegative = i - 1;
                break;
            }
        }
        int start = 0;
        while (startPositive < nums.length &&  endNegative > -1) {
            if (nums[startPositive] + nums[endNegative] == 0) {
                result[start++] = nums[startPositive] *  nums[startPositive];
                result[start++] = nums[startPositive] *  nums[startPositive];
                startPositive++;
                endNegative--;
            } else if (nums[startPositive] + nums[endNegative] < 0) {
                result[start++] = nums[startPositive] * nums[startPositive];
                startPositive++;
            } else {
                result[start++] = nums[endNegative] * nums[endNegative];
                endNegative--;
            }
        }

        if (startPositive >= nums.length) {
            while (endNegative > -1) {
                result[start++] = nums[endNegative] * nums[endNegative];
                endNegative--;
            }
        } else {
            while (startPositive < nums.length) {
                result[start++] = nums[startPositive] * nums[startPositive];
                startPositive++;
            }
        }

        return result;
    }
}
