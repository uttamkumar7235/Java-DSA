// Fibonacci Number at nth position

import java.util.*;

public class Recursion5 {

    public static int fib(int n) {
        if (n < 0) {
            return -1;
        }
        if(n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Fibonacci number at positon " + n + " = " + fib(n));
        
    }
}
