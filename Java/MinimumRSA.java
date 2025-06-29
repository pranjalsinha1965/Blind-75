import java.util.Arrays;

public class MinimumRSA {
    public int findMin(int[] nums) {
        if (nums.length == 1)
        return nums[0];
        
        int left = 0, right = nums.length - 1;

        if (nums[right] > nums[0])
            return nums[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Prevent index out of bounds
            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1])
                return nums[mid + 1];

            if (mid > 0 && nums[mid - 1] > nums[mid])
                return nums[mid];

            if (nums[mid] >= nums[left])
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // Fallback (shouldn't happen if input is valid)
    }

    public static void main(String args[]) {
        int[] nums = {3, 4, 5, 1, 2};
        MinimumRSA rsa = new MinimumRSA();
        int result = rsa.findMin(nums);
        System.out.println("The input array is: " + Arrays.toString(nums));
        System.out.println("The solution is: " + result);
    }
}
