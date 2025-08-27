package LeetCode;

public class SolutionValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3){
            return false;
        }

        if (arr[0] >= arr[1]){
            return false;
        }

        boolean isUpper = true;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }

            if (arr[i] > arr[i+1] && isUpper) {
                isUpper = false;
                continue;
            }

            if ((arr[i] - arr[i+1]) * (isUpper ? 1 : -1) > 0) {
                return false;
            }
        }

        return !isUpper;
    }
}
