import java.util.HashMap;
import java.util.Arrays;

public class rough {
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++)
        {
            int targetNum = target - nums[i];
            if(map.containsKey(targetNum))
            return new int[] {map.get(targetNum), i};
            else map.put(nums[i], i);
        }    
        return null;
    }
    public static void main(String args[])
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum obj = new twoSum();
        int[] solution = obj.twoSumSolution(nums, target);
        System.out.println("The array is: " + Arrays.toString(nums));
        System.out.println("The taregt is: " + target);
        System.out.println("The required pair of indices is: " + Arrays.toString(solution));
    }
}
