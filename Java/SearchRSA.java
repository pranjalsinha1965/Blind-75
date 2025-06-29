import java.util.Arrays;

public class SearchRSA {
    public int search(int[] nums, int target)
    {
        int left = 0, right = nums.length - 1;
        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
            return mid;
            if(nums[mid] >= nums[left])
            {
                if(target >= nums[left] && target < nums[mid])
                left = mid - 1;
                else
                right = mid + 1;
            }
            else
            {
                if(target > nums[mid] && target <= nums[right])
                left = mid + 1;
                else
                right = mid - 1;
            }
        }
        if(nums[left] == target)
        return left;
        else
        return -1;
    }
    public static void main(String args[])
    {
        int[] nums = {4, 5, 7, 0, 1, 2};
        SearchRSA rsa = new SearchRSA();
        int result = rsa.search(nums, 0);
        System.out.println("The input Array is: " + Arrays.toString(nums));
        System.out.println("The reuiqred output is: " + rsa);
    }
}
