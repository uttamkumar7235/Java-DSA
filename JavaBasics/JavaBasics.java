public class JavaBasics {
  public static void main(String[] args) {

    System.out.println("Hello World !");

    // 1. Primitive Data Types (8 types)

    // byte (1 byte) - Small integers (–128 to 127)
    byte b = 8; 
    System.out.println(b);

    // short (2 bytes) - Medium integers
    short s = 32000; 
    System.out.println(s);

    // int (4 bytes) - Default integer type
    int a = 19; 
    System.out.println(a);

    // long (8 bytes) - Large integers (use L at end)
    long l = 35210000L; 
    System.out.println(l);

    // float (4 bytes) - Decimal numbers (use f)
    float f = 3.14f; 
    System.out.println(f);

    // double (8 bytes) -  Big decimal values
    double d = 98.99; 
    System.out.println(d);

    // char (2 bytes) - Stores a single character
    char ch = 'a';
    System.out.println(ch);

    // boolean (1 bit) - true / false values
    boolean bool = true;
    System.out.println(bool);



    // 2. Non-Primitive (Reference) Data Types

    // String, Arrays, Classes, Interfaces, Objects

    String name = "Uttam";
    System.out.println("Name : " + name);

  }
}