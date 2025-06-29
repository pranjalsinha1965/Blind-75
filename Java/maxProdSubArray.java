import java.util.Arrays;

public class maxProdSubArray {
    public int maxProduct(int[] nums)
    {
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        for(int i=1; i<n; i++)
        {
            if(nums[i] < 0)
            {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(ans, max);
        }
        return ans;
    }
    public static void main(String args[])
    {
        int[] nums = {2, 3, -2, 4};
        maxProdSubArray mpsa = new maxProdSubArray();
        int result = mpsa.maxProduct(nums);
        System.out.println("Input Array is: " + Arrays.toString(nums));
        System.out.println("The solutions is: " + result);
    }
}
