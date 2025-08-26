package LeetCode;

import java.util.Arrays;

public class SolutionDuplicateZeros
{
    public void duplicateZeros(int[] arr) {
        int flag = -1;
        int i;
        for (i = 0; i < arr.length; i++) {
            flag++;
            if (arr[i] == 0) {
                flag++;
            }
            if (flag >= arr.length - 1) {
                break;
            }
        }
        if (i == arr.length) {
            return;
        }

        if (flag > arr.length - 1) {
            flag = flag - 2;
            arr[arr.length - 1] = 0;
            i--;
        }

        while (flag >= 0) {
            if (arr[i] == 0) {
                arr[flag--] = 0;
                arr[flag--] = 0;
            } else  {
                arr[flag--] = arr[i];
            }

            i--;
        }
    }
}
