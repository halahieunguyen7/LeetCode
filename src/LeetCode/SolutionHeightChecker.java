package LeetCode;

public class SolutionHeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortHeights = new int[heights.length];
        System.arraycopy(heights, 0, sortHeights, 0, heights.length);
        int j;
        for (int i = 0; i < sortHeights.length; i++) {
            for (j = i + 1; j < sortHeights.length; j++) {
                if (sortHeights[i] > sortHeights[j]) {
                    sortHeights[i] = sortHeights[i]-sortHeights[j];
                    sortHeights[j] = sortHeights[i] + sortHeights[j];
                    sortHeights[i] = sortHeights[j] - sortHeights[i];
                }
            }
        }
        j = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortHeights[i]) {
                j++;
            }
        }

        return j;
    }
}
