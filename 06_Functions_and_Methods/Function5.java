import java.util.Scanner;

public class Function5 {

    // Function to find Prime Number in Range
    
    public static void primeInRange(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime (int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range : ");
        int r = sc.nextInt();

        primeInRange(r);
    }
}
