public class BinarySearch {
    public static void main(String[] args) {

        // Array should be sorted for binary search either asc or desc
//        int arr[] = {-20, -13, -2, 0, 1, 3, 4, 6, 654, 764, 1085, 24222};
        int arr[] = {2839, 1234, 1042, 0, -2034};
        // Target Element to be found
        int target = 0;
        int ans = binarySearch(arr,target);
        System.out.print("Target element " + target + " Found at index : " + ans + " !!!!!!!");
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
//            int mid = start + end / 2;  // Once it add start and end chances of big integer value
            int mid = start + (end - start) / 2; // Formula to reduce big integer value

            if (target < arr[mid]) // Less than for desc array
                start = mid + 1;
            else if (target > arr[mid]) // Greater than for asc array
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
