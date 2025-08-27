package LeetCode;

import java.util.HashSet;

public class SolutionCheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> table = new HashSet<>();
        for (int i : arr) {
            table.add(i);
        }

        boolean zeroFlag = false;
        for (int i : arr) {
            if (i == 0) {
                if (!zeroFlag) {
                    zeroFlag = true;
                    continue;
                } else {
                    return true;
                }
            }

            if (table.contains(i * 2)) {
                return true;
            }
        }

        return false;
    }
}
