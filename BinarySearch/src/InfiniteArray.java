public class InfiniteArray {
    public static void main(String[] args) {

        int nums[] = {2, 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 200, 245, 343, 456, 765, 1000,
        1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1101, 1122};
        int target = 1004;
        System.out.println(ans(nums,target));
    }

    static int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (target > nums[end]) {
            int newStart = end + 1; // New Start

            // Double the box value
            end = end + (end - start + 1) * 2;
            start = newStart;
        }


        return FindBinarySearch(nums,target,start,end);
    }
    static int FindBinarySearch(int[] nums, int target,int start, int end) {

        while (start <= end) {

            //Find mid element
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
