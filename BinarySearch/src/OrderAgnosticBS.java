public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr1[] = {-80, -20, 0, 1, 22, 45, 67, 89, 98, 1002, 2333, 4232};
        int arr2[] = {4823, 1245, 987, 656, 453, 23, 0 , -23, -43, -345};
        int target1 = 22;
        int target2 = 453;
        System.out.println(Math.sqrt(2));
        int ans1 = orderAgnosticBS(arr1, target1);
        int ans2 = orderAgnosticBS(arr2, target2);
        System.out.println("Target Element " + target1 + " Found at index : " + ans1 + " !!");
        System.out.println("Target Element " + target2 + " Found at index : " + ans2 + " !!");
    }

    static int orderAgnosticBS(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            if (isAsc){
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
