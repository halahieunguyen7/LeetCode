package LeetCode;

public class SolutionMoveZeroes {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (writePointer != i) {
                    nums[writePointer] = nums[i];
                }
                writePointer++;
            }
        }

        for (int j = writePointer; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
