public class TilingProblem {

    public static int tilingProblem(int n) { // 2xn (board size)
        
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // Vertical Choice
        int fnm1 = tilingProblem(n-1);

        // Horizontal Choice
        int fnm2 = tilingProblem(n-2);

        return fnm1+fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
