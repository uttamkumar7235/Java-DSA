public class Operators {
  public static void main(String[] args) {
    
    int a = 10;
    int b = 3;

    // 1. Arithmetic Operators

    System.out.println("Addition = " + (a+b));
    System.out.println("Subtraction = " + (a-b));
    System.out.println("Multiplication = " + (a*b));
    System.out.println("Division = " + (a/b));
    System.out.println("Modulo = " + (a%b));


    // 2. Unary Operators

    System.out.println("Pre-increament (++a) = " + a);
    System.out.println("Post-increament (a++) = " + a);
    System.out.println("Pre-decreament (--a) = " + a);
    System.out.println("Post-decreament (a--) = " + a);
    System.out.println(a);


    // 3. Assignment Operators

    int c = a;
    System.out.println("c = " + c);
    c *= 5;
    System.out.println("updated c = " + c);


    // 4. Relational (Comparison) Operators
    // a=10 , b=3

    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);


    // 5. Logical Operators

    int age = 25;
    boolean hasID = true;

    if(age >= 18 && hasID) {
      System.out.println("Eligible to vote.");
    }


    // 6. Bitwise Operators

    int x = 5, y = 3;
    System.out.println(x & y); // 1
    System.out.println(x | y); // 7


    // 7. Ternary Operator

    int yourAge = 16;
    String result = (yourAge >= 18) ? "Adult" : "Minor";
    System.out.println(result);


    // 8. instanceof Operator

    String s = "Hello";
    System.out.println(s instanceof String); // true

  }
}