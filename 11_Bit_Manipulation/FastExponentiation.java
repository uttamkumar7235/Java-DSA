public class FastExponentiation {
    
    public static long power(long a, long n) {
        long result = 1;

        while (n > 0) {
            if ((n & 1) == 1) {
                result *= a;
            }
            a = a * a;
            n = n >> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        
        System.out.println(power(3, 13));
    }
}
