import java.util.Scanner;

public class Function1{
    
    // Funtcion to find product of two numbers 
    
    public static int Product(int num1, int num2){
        int product = num1*num2;
        return product;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        int prod = Product(a,b);
        System.out.println("Product = "+prod);

    }
}