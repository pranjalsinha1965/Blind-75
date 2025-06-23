public class findMin{
    public int findMinRotArr(int[] nums)
    {
        int s = 0, e = nums.length - 1;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if(s == e) return nums[s];
            if(nums[m] >= nums[s] && nums[s] > nums[e])
            {
                s = m + 1;
            }
            else
            {
                e = m;
            }
        }

        return -1;
    }
    public static void main(String args[])
    {
        int[] nums = {3, 4, 5, 1, 2};
        findMin obj = new findMin(); // create object
        int solution = obj.findMinRotArr(nums); // call method
        System.out.println("The given array is: " + nums);
        System.out.println("The solution is: " + solution);

    }
}
