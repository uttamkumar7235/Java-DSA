import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any number : ");
    int num = sc.nextInt();

    int rev = 0;
    int i = num;

    while (i > 0) {
      int lastDigit = i%10;
      rev = rev*10 + lastDigit;
      i /= 10;
    }

    System.out.print("Reverse = " + rev);
  }
}
