import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {1, 23, 54, 78, 53};
//        int arr[] = new int[5];
//        System.out.print("Enter Array Elements : ");
//        inputArray(input, arr);
        System.out.print("Enter Target Element : ");
        int target = input.nextInt();
        int result = linearSearch(arr,target);
        System.out.println("Array Element " + target + " is at index : " + result);
    }
    static int linearSearch (int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
//    static int inputArray (Scanner input, int arr[]) {
//        for (int index = 0; index < arr.length; index++) {
//            arr[index] = input.nextInt();
//            return arr[index];
//        }
//        return -1;
//    }
}

