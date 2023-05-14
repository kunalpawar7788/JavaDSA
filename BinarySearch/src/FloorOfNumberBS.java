public class FloorOfNumberBS {
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 9, 14, 16, 18 };
        int target = 4;
        int ans = floorNo(arr,target);
        System.out.println(ans);
    }

    static int floorNo(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[end] <= target) {
                int floor = arr[end];
                return floor;
            } else {
                end--;
            }

        }
        return -1;
    }
}
