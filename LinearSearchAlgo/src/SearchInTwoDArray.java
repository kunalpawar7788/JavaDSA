import java.util.Arrays;
import java.util.Scanner;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = {
                {17, 23, 41},
                {84, 34, 56},
                {45, 89, 12}
        };
        System.out.print("Enter the element to be found : ");
        int target = in.nextInt();
        int answer[] = searchIn2DArray(arr, target);
        System.out.println("Element found at index : " + Arrays.toString(answer));
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[] {-1,-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
//                int temp = arr[row][col];
                if (target == arr[row][col]) {
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
