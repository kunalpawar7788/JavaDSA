public class GiftFromRichestPile {
    public static void main(String[] args) {
        int [] gifts = {25, 64, 9, 4, 100};
        System.out.println(maximumNo(gifts));
        System.out.println(giftsRemaining(gifts));

    }

    static int maximumNo(int[] gifts) {
        int maxNo = 0;
        for (int gift : gifts) {
            int num = gifts[0];
            if (gift > num) maxNo = gift;
        }
        return maxNo;
    }

    static int giftsRemaining(int[] gifts) {
        int rem = (int) Math.sqrt(maximumNo(gifts));
        return rem;
    }
}
