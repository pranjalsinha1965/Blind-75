import java.util.HashSet;
import java.util.Arrays;

public class DuplicateChecker {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
        DuplicateChecker checker = new DuplicateChecker();
        boolean result = checker.containsDuplicate(nums);

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Contains Duplicate? " + result);
    }
}
