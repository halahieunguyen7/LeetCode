import LeetCode.*;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Solution383 sol = new Solution383();
//        boolean result = sol.canConstruct("bac", "aab");

//        SolutionMaxConsecutiveOnes sol = new SolutionMaxConsecutiveOnes();
//        int result = sol.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});

//        SolutionNumbersWithEvenNumberOfDigits sol = new SolutionNumbersWithEvenNumberOfDigits();
//        int result = sol.findNumbers(new int[]{12,345,2,6,7896});

//        SolutionSquaresOfASortedArray sol = new SolutionSquaresOfASortedArray();
//        int[] result = sol.sortedSquares(new int[]{-4,-1,0,3,10});

//        SolutionDuplicateZeros sol = new SolutionDuplicateZeros();
//        int[] result = new int[] {8,4,5,0,0,0,0,7};
//        sol.duplicateZeros(result);

        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;
        int[] result = nums1;
        SolutionMergeSortedArray  sol = new SolutionMergeSortedArray();
        sol.merge(nums1, m, nums2, n);

            System.out.println(Arrays.toString(result));
    }
}