// Print Factorial of a Number

import java.util.*;

public class Recursion3 {
    
    public static long printFactorial(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        long fact = n * printFactorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Factorial of " + n + " = " + printFactorial(n));
        
    }
}
