package LeetCode;

public class SolutionNumbersWithEvenNumberOfDigits
{
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += Math.floor(Math.log10(num)) % 2;
        }

        return result;
    }
}
