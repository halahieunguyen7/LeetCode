package LeetCode;

import java.util.Arrays;

public class SolutionThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int writePointer = 0;
        for(int x:nums){
            if (writePointer == 0 && x < nums[0]) {
                nums[1] = nums[0];
                nums[0] = x;
                writePointer++;
                continue;
            }

            if (writePointer == 1 && x < nums[1]) {
                if (x == nums[0]) {
                    continue;
                }
                if (x < nums[0]) {
                    nums[2] = nums[1];
                    nums[1] = nums[0];
                    nums[0] = x;
                } else {
                    nums[2] = nums[1];
                    nums[1] = x;
                }
                writePointer++;
                continue;
            }

            System.out.println(Arrays.toString(nums));
            System.out.println(writePointer);
            System.out.println(x);
            System.out.println("\n");
            if (x > nums[writePointer]){
                nums[++writePointer]=x;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(writePointer);

        return writePointer >= 2 ? nums[writePointer - 2] : nums[writePointer];
    }
}
