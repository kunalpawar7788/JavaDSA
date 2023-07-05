public class sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(15));
    }

    public static int mySqrt(int x) {
        int ans = 0, low = 0, high = x;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x/mid == mid)
                return mid;
            else if (x/mid < mid)
                high = mid - 1;
            else {
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
