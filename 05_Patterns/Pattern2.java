public class Pattern2 {
  public static void main(String[] args) {
    int n = 5;

    // Inverted Right Angle Triangle
    for (int i=1; i<=n; i++) {
      for (int j=i; j<=n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
