package LeetCode;

public class SolutionMaxConsecutiveOnes
{
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int max = 0;
        int count = 0;
        for (int num : nums)
        {
            if (num == 0)
            {
                if (count > max) {
                    max = count;
                };

                count = 0;
            } else {
                count++;
            }
        }

        return Math.max(max, count);
    }
}
