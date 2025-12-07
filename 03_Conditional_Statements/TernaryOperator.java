// Take marks as input from user and print result(pass/fail)

import java.util.Scanner;

public class TernaryOperator {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks : ");
    int marks = sc.nextInt();

    String result = (marks >= 40) ? "Passed." : "Failed.";
    System.out.println("Your are " + result);
    
  }
}
