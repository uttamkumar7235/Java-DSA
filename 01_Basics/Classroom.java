import java.util.Scanner;

public class Classroom {

  public static void main(String[] args) {
    
    // This is a single line comment

    /*
      This 
      is 
      a 
      multiline 
      comments
    */

  // variable declaration
  int num; 
  String name;
  String fullName;

  Scanner sc1 = new Scanner(System.in);
  Scanner sc2 = new Scanner(System.in);
  Scanner sc3 = new Scanner(System.in);

  System.out.print("Enter any number: ");
  num = sc1.nextInt(); // taking integer input 
  System.out.println("Your number is : " + num);
  
  System.out.print("Enter name:");
  name = sc2.next();
  System.out.println("Hi! " + name);

  System.out.print("Enter full name: ");
  fullName = sc3.nextLine();
  System.out.println("Hello! " + fullName);

  }
}
