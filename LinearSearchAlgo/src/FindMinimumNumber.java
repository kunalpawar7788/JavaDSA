public class FindMinimumNumber {
    public static void main(String[] args) {
        int arr[] = { 15, -13, -42, 78, 98};
        int ans = min(arr);
        System.out.println("Minimum number in array is : " + ans);
    }

    static int min(int[] arr) {
        int result = arr[0];
        if (arr.length == 0) {
           return -1;
        }
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < result) {
                result = arr[index];
            }
        }
        return result;
    }
}
