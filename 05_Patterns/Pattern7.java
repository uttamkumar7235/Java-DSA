// Floyd's Triangle

public class Pattern7 {
  public static void main(String[] args) {
    int n = 5;
    int counter = 1;
    
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=i; j++) {
        System.out.print(counter++ + " ");
      }
      System.out.println();
    }
  }
}
