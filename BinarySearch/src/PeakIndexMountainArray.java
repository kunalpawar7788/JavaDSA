public class PeakIndexMountainArray {

    // Mountain array also known as Bitonic Array
    public static void main(String[] args) {
        int nums[] = {0, 2, 1, 0};
        System.out.println(FindBinarySearch(nums));
    }
    static int FindBinarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //Find mid element
            int mid = start + (end - start) / 2;
            // We are in desc part of array
            if (arr[mid] > arr[mid + 1])
                end = mid;
            // We are in desc part of array
            else
                start = mid + 1;
        }
        return start; // start and end are same pointing to the max one!
    }
}
