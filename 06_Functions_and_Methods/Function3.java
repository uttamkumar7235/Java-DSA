import java.util.Scanner;

public class Function3 {
    
    // Function to find binomial coefficient nCr = n! / r!*(n-r)!
    
    public static int binoCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        return fact_n / (fact_r * fact_nmr);
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter value of r : ");
        int r = sc.nextInt();

        System.out.println("Binomial Coefficient = " + binoCoeff(n, r));
    }
}
