package LeetCode;

import java.util.Arrays;

public class SolutionThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int writePointer = 0;
        for (int x : nums) {
            if (writePointer == 0 && x < nums[0]) {
                nums[1] = nums[0];
                nums[0] = x;
                ++writePointer;
                continue;
            }

            if (writePointer < 4 && x < nums[writePointer]) {
                int i = writePointer - 1;
                while (i > -1) {
                    if(nums[i] == x) {
                        break;
                    }
                    i--;
                }

                if (i > -1) {
                    continue;
                }

                writePointer++;
                i = writePointer;
                while (i - 1 > -1 && nums[i - 1] > x) {
                    nums[i--] = nums[i];
                }
                nums[i] = x;
                continue;
            }

            if (writePointer == 2 && x < nums[1]) {
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
                ++writePointer;
                continue;
            }

            if (x > nums[writePointer]) {
                nums[++writePointer] = x;
            }
            if (x == nums[writePointer] ||  x == nums[writePointer - 1] || x <= nums[writePointer - 2]) {
                continue;
            }

            if (x < nums[writePointer - 1]) {
                nums[writePointer - 2] = x;
            } else {
                nums[writePointer - 2] = nums[writePointer - 1];
                nums[writePointer - 1] = x;
            }

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(writePointer);
        return writePointer >= 2 ? nums[writePointer - 2] : nums[writePointer];
    }
}
