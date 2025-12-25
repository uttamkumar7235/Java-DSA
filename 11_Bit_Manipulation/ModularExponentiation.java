public class ModularExponentiation {
    
    public static long powerMod (long a, long n, long mod) {
        long result = 1;
        a = a % mod;

        while (n > 0) {
            if ((n & 1) == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            n = n >> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(powerMod(3, 13, 7));
    }
}
