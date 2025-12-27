// Print x to the power n

public class Recursion9 {

    // O(n)
    public static int printXpowN(int x, int n) {
        if(n == 1) {
            return x;
        }
        int result = x * printXpowN(x, n-1);
        return result;
    }

    // O(log n)
    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if (n%2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        
        System.out.println(printXpowN(x, n));
        System.out.println(optimizedPower(x, n));
    }
}
