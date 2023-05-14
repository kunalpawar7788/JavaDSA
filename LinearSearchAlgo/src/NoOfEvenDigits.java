public class NoOfEvenDigits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println("Numbers with Even Number of Digits are : " + ans);
    }
    static int findNumbers(int nums[]) {
        int count = 0;
//        for (int num = 0; num < nums.length; num++) {
        for (int num: nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    // Count Number of Digits

//    static int digits2(int num) {
//          return (int)(Math.log10(num)) + 1;
//    }
    static int digits(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
