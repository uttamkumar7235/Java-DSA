// // Max-Subarray Sum - III (Kadane's Algorithm) - O(n)

public class maxSubarraySum3 {

    public static int kadanes(int num[]) {
        int maxsum = num[0];
        int currsum = num[0];

        for (int i = 1; i < num.length; i++) {
            currsum = Math.max(num[i], currsum + num[i]);
            maxsum = Math.max(currsum, maxsum);
        } 

        return maxsum;
    }

    public static void main(String[] args) {

        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxsum = kadanes(num);
        System.out.println("Maximum sum of the subarray : " + maxsum);
    }
}
