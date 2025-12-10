// Butterfly Pattern

public class Pattern9 {
  public static void main(String[] args) {
    int n = 4;

    // upper half
    for (int i=1; i<=n; i++) {
      // left stars
      for (int j=1; j<=i; j++) {
        System.out.print("* ");
      }

      // spaces
      for (int s=1; s<=2*(n - i); s++) {
        System.out.print("  ");
      }

      // right stars
      for (int j=1; j<=i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    // lower half
    for (int i=n-1; i>=1; i--) {
      // left stars
      for (int j=1; j<=i; j++) {
        System.out.print("* ");
      }

      // spaces
      for (int s=1; s<=2*(n - i); s++) {
        System.out.print("  ");
      }

      // right stars
      for (int j=1; j<=i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }

  }
}
