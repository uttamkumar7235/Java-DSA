// Print numbers in Decreasing order

import java.util.*;

public class Recursion2 {

    public static void decreasingNumber(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        decreasingNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        decreasingNumber(n);
    }
}