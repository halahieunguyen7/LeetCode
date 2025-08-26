package LeetCode;


public class SolutionMergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int flag = nums1.length - 1;
        while (flag >= 0 && m > -1 && n > -1) {
            if (nums1[m] > nums2[n]) {
                nums1[flag--] = nums1[m--];
            } else {
                nums1[flag--] = nums2[n--];
            }
        }
        while (m >= 0) {
            nums1[flag--] = nums1[m--];
        }

        while (n >= 0) {
            nums1[flag--] = nums2[n--];
        }
    }
}
