package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionFindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) {
                continue;
            }

            while (nums[i] > 0 && nums[nums[i]-1] != 0) {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = 0;
            }
        }

        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
