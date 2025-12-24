public class OddEven {
    
    public static void checkEvenOdd(int n) {
        int bitMask = 1;

        if ((n & bitMask) == 0) {
            System.out.println(n + " is an Even Number.");
        }
        else {
            System.out.println(n + " is an Odd Number.");
        }
    }

    public static void main(String[] args) {
        
        checkEvenOdd(5);
        checkEvenOdd(18);
    }
}
