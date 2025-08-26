package LeetCode;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]ransom = new int[75];

        for (char c : magazine.toCharArray()) {
            ransom[(int) c - 48]++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (ransom[(int) c - 48] == 0) {
                return false;
            }

            ransom[(int) c - 48]--;
        }

        return true;
    }
}
