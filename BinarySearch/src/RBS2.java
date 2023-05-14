public class RBS2 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If Pivot is not found, go with Normal Binary search
        if (pivot == -1) {
            return binarySearch(nums,target,0,nums.length - 1);
        }
        // Pivot is found , we have two asc arrays
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return binarySearch(nums,target,0,pivot - 1);
        }
        return binarySearch(nums,target,pivot + 1, nums.length - 1);
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                start = mid + 1;
            } else if (target > nums[mid]){
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //Case 1
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            //Case 2
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            //Case 3
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1; //Case 4
            }
        }
        return -1;
    }
}
