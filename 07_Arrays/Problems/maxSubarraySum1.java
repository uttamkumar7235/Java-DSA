// Max-Subarray Sum - I (Bruteforce)

public class maxSubarraySum1 {

    public static int maxSumSubarray(int num[]){
        int totalSubarray = 0;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++){
            int start = i;
            for (int j = i; j < num.length; j++){
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++){
                    currsum += num[k];
                }
                // System.out.println("Current Sum : " + currsum);
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
            
        }

        return maxsum;
        
    }
        public static void main(String args[]){

            int num []= {2,4,6,8,10};
            int maxSum = maxSumSubarray(num);
            System.out.println("Max sum of the subarray : " + maxSum);

        }
}