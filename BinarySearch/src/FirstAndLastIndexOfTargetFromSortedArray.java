import java.util.Arrays;

public class FirstAndLastIndexOfTargetFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 45, 23, 45, 45, 45, 45, 56, 76};
        int target = 45;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        int startVal = search(nums, target, true);
        int endVal = search(nums, target, false);
        ans[0] = startVal;
        ans[1] = endVal;
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
