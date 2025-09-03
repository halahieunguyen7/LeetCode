import LeetCode.Solution43;

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

//        int[] nums1 = new int[]{0};
//        int[] nums2 = new int[]{1};
//        int m = 0;
//        int n = 1;
//        int[] result = nums1;
//        SolutionMergeSortedArray  sol = new SolutionMergeSortedArray();
//        sol.merge(nums1, m, nums2, n);

//        SolutionRemoveElement sol = new SolutionRemoveElement();
//        int result = sol.removeElement(new int[]{2, 2, 3}, 2);

//        SolutionRemoveDuplicatesFromSortedArray sol = new SolutionRemoveDuplicatesFromSortedArray();
//        int result = sol.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

//        SolutionCheckIfNAndItsDoubleExist sol = new SolutionCheckIfNAndItsDoubleExist();
//        boolean result = sol.checkIfExist(new int[]{10, 2, 5, 3});
//        SolutionValidMountainArray sol = new SolutionValidMountainArray();
//        boolean result = sol.validMountainArray(new int[] {0,3,2,1});
//        SolutionReplaceElementsWithGreatestElementOnRightSide sol =  new SolutionReplaceElementsWithGreatestElementOnRightSide();
//        int[] result = sol.replaceElements(new int[]{17,18,5,4,6,1});
//        SolutionMoveZeroes sol = new SolutionMoveZeroes();
//        int[] result = new int[]{0,1,0,3,12};
//        sol.moveZeroes(result);

//        SolutionSortArrayByParity sol = new SolutionSortArrayByParity();
//        int[] result = new int[]{3,1,2,4};
//        sol.sortArrayByParity(result);

//        SolutionHeightChecker sol = new SolutionHeightChecker();
//        int result = sol.heightChecker(new int[]{1,1,4,2,1,3});
//        String content;
//        try {
//            content = new String(Files.readAllBytes(Paths.get("src/LeetCode/solution_third_maximum_number.txt")));
//        } catch (IOException e) {
//            System.err.println("Lỗi đọc file: " + e.getMessage());
//            return;
//        }
//
//        int[] nums = Arrays.stream(content.split(","))
//                .map(String::trim)
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        SolutionThirdMaximumNumber sol = new SolutionThirdMaximumNumber();
//        int result = sol.thirdMax(nums);

//        SolutionFindAllNumbersDisappearedInAnArray sol = new SolutionFindAllNumbersDisappearedInAnArray();
//        List<Integer> result =  sol.findDisappearedNumbers(new int[]{1,1});
//
//        System.out.println(Arrays.toString(result.toArray()));
        Solution43 sol = new Solution43();
        System.out.println(sol.multiply("123456789", "987654321"));

    }
}