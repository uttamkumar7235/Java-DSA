// Solid Rhombus

public class Pattern10 {
  public static void main(String[] args) {
    int n = 5;

    for (int i=1; i<=n; i++) {
      // spaces
      for (int s=i; s<n; s++) {
        System.out.print("  ");
      }

      // stars
      for (int j=1; j<=n; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }

  }
}
