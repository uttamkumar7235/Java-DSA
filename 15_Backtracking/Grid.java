public class Grid {

  public static int gridWays(int i, int j, int m, int n) {

    // Base case
    if (i == m-1 && j == n-1) { // last cell - target cell
      return 1;
    }
    if (i >= m || j >= n) { // out of boundary
      return 0;
    }

    int right = gridWays(i, j+1, m, n);
    int down = gridWays(i+1, j, m, n);

    return right + down;
  }

  public static void main(String[] args) {
    int n = 3, m = 3;
    System.out.println("Total ways = " + gridWays(0, 0, m, n));
  }
}