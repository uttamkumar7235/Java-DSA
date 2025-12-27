public class FriendsPairing {

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // Single Choice
        int fnm1 = friendsPairing(n-1);

        // Pairing
        int fnm2 = friendsPairing(n-2);

        int totWays = fnm1 + (n-1)*fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(4));
    }
}
