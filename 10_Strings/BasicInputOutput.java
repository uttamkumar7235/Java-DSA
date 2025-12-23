import java.util.*;

public class BasicInputOutput {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        // Input
        System.out.print("Enter name1 : ");
        String name1 = sc1.next(); // Input only single word

        System.out.print("Enter name2 : ");
        String name2 = sc2.nextLine(); // Input a line of words

        // Output
        System.out.println("Name1 = " + name1);
        System.out.println("Name 2 = " + name2);

        // String length
        System.out.println("Length of name 1 = " + name1.length());
        System.out.println("Length of name 2 = " + name2.length());

        // String Concatenation
        String firstName = "Uttam";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName; 
        System.out.println("My full name is " + fullName);
    }
}