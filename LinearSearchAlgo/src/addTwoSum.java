import java.util.Arrays;

public class addTwoSum {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        for (int index = 0; index < nums.length; index++) {
            int result = nums[index] + nums[index + 1];
            if (result == target) {
                System.out.println("Target Found : " + index);
            }
        }
    }
}
