package LeetCode;

public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < accounts.length; i++) {
            temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }

            if (temp > result) {
                result = temp;
            }
        }

        return result;
    }
}
