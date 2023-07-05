import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {17, 27, 37, 47},
                {19, 29, 39, 49}
        };
        System.out.println(search(nums,15));
    }

    public static boolean search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target)
                return true;
            if (matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return false;
    }
}
