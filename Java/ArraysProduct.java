import java.util.Arrays;

public class ArraysProduct {
    public int[] productExceptSelf(int[] nums)
    {
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = 1;
        // left pass 
        for(int i=1; i<len; i++)
            ans[i] = ans[i-1]*nums[i - 1];
        int right = 1;
        // right pass 
        for(int i = len-1; i>=1; i--)
        {
            ans[i] *= right;
            right *= nums[i]; 
        }
        return ans;
    }
    public static void main(String args[])
    {
        int[] nums = {1, 2, 3, 4};
        ArraysProduct product = new ArraysProduct();
        int result[] = product.productExceptSelf(nums);
        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Product except self array: " + Arrays.toString(result));
    }
}


