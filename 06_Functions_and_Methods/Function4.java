import java.util.Scanner;

public class Function4 {

    // Function to check Prime Number
    
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is Prime Number.");
        }
        else {
            System.out.println(n + " is NOT a Prime Number.");
        }

    }
}