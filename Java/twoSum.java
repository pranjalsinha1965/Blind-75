import java.util.Arrays;

public class twoSum {
    public int[] twoSumSolution(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum obj = new twoSum(); // create object
        int[] solution = obj.twoSumSolution(nums, target); // call method

        System.out.println("The array is: " + Arrays.toString(nums));
        System.out.println("The target is: " + target);
        System.out.println("The required pair of indices is: " + Arrays.toString(solution));
    }
}
