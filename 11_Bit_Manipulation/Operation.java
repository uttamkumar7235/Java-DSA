public class Operation {
        
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit (int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // }
        // else {
        //     return setIthBit(n, i);
        // }

        // 2nd Method
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b;

        return n & bitMask;
    }

    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            // check LSB == 1
            if ((n & 1) == 1) { 
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        // Get ith bit (Print bit at ith position)
        System.out.println(getIthBit(10, 2)); // 0

        // Set ith bit (set 1 at ith position)
        System.out.println(setIthBit(10, 2)); // 14

        // Clear ith bit (set 0 at ith position)
        System.out.println(clearIthBit(10, 1)); // 8

        // Update 0 or 1at ith position
        System.out.println(updateIthBit(10, 2, 1)); // 14

        // Set 0 on left side after i
        System.out.println(clearLastIBits(15, 2)); // 12

        // Clear range of bits
        System.out.println(clearRangeBits(10, 2, 4)); // 2

        // Count Set bits in a number 
        System.out.println(countSetBits(10)); // 2
    }
}
