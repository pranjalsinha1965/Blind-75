import java.util.Arrays;

public class maxSub {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) { // start from index 1
            curr = Math.max(nums[i], nums[i] + curr);
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {-1, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSub subArrays = new maxSub();
        int solution = subArrays.maxSubArray(nums); // fixed

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Maximum sum of subarray is: " + solution);
    }
}
