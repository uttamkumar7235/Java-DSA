// Print numbers in Increasing order

import java.util.*;

public class Recursion1 {

    public static void increasingNumber(int n) {
        if(n == 1) {
            System.out.print(n + " ");
            return;
        }

        increasingNumber(n-1);
        System.out.print(n + " ");
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        increasingNumber(n);
    }
}
