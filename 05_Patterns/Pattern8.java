// Binary (0–1) Triangle

public class Pattern8 {
  public static void main(String[] args) {
    int n = 5;
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++) {
        if ( (i+j)%2 == 0 ) { // even
          System.out.print("1 ");
        }
        else {
          System.out.print("0 "); // odd
        }
      }
      System.out.println();
    }
  }
}
