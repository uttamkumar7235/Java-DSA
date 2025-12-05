import java.util.Scanner;

public class AreaOfCircle {

  public static void main(String[] args) {

    float pi = 3.14f;

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    float radius = sc.nextFloat();
    float area = pi*radius*radius;

    System.out.println("Area of Circle = " + area + " unit sq.");
  }
}
