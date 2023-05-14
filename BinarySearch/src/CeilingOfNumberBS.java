public class CeilingOfNumberBS {
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;
//        int ans = binarySearch(arr,target);
        int ans = ceilingNo(arr,target);
        System.out.println(ans);
    }

    static int ceilingNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int ceil = 0;
            if (arr[start] >= target) {
                ceil = arr[start];
                return ceil;
            } else {
                start++;
            }

        }
        return -1;
    }
    /*static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ceil = arr[start] >= target;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else  {
                return mid;
            }
        }
        return -1;
    }*/


}
