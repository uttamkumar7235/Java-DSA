// Sum of n natural numbers

import java.util.*;

public class Recursion4 {
    
    public static int printSum(int n) {
        if(n == 1) {
            return 1;
        }
        int sum = n + printSum(n-1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Sum of first n natural number = " + printSum(n));
        
    }
}
