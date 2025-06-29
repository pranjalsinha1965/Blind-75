import java.util.Arrays;


public class waterContainer {
    public int maxArea(int[] height)
    {
        int max = 0, left = 0, right = height.length - 1, area;
        while(left < right)
        {
            if(height[right] < height[left])
            {
                area = (right - left) * (height[right]);
                right--;
            }
            else
            {
                area = (right - left) * (height[left]);
                left++;
            }
            max = Math.max(max, area);
        }
        return max;
    }
    public static void main(String args[])
    {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        waterContainer containers = new waterContainer();
        int maxAmount = containers.maxArea(height);
        System.out.println("The input array of heights is: " + Arrays.toString(height));
        System.out.println("The maximum height from the array is: " + maxAmount);
    }
}
