import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        // Initialise a 2D array for accounts
        int[][] accounts = {{1, 2, 3},{3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int wealth = 0;
            for (int account = 0; account < accounts[person].length ; account++) {
                wealth += accounts[person][account];
            }
            if (wealth > ans) {
                ans = wealth;
            }
        }
        return ans ;
    }
}
