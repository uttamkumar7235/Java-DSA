import java.util.Scanner;

public class EvenNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of n : ");
    int n = sc.nextInt();

    System.out.printf("Even numbers from 1 and %d : %n", n);

    int i = 1;
    while (i <= n) {
      if (i % 2 == 0){
        System.out.print(i + " ");
      }
      i++;
    }

  }
}
