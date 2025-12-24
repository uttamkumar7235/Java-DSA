public class BitWiseOperator {

    public static void main(String[] args) {

        // Binary AND (&)
        System.out.println((5 & 6)); // 4

        // Binary OR (|)
        System.out.println((5 | 6)); // 7

        // Binary XOR (^)
        System.out.println((5 ^ 6));  // 3

        // Binary 1's Complement (~)
        System.out.println((~5)); // -6
        System.out.println((~0));  // -1

        // Binary Left Shift (<<)
        System.out.println((5 << 2));  // 20

        // Binary Right Shift (>>)
        System.out.println((6 >> 2));  // 1
    }
}