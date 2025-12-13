import java.util.Scanner;

public class Function2 {

    // Funtion to find factorial of a number 
    
    public static int Factorial(int number){
        int f = 1;
        for(int i = 1; i <= number; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        int num = sc.nextInt();

        int factorial = Factorial(num);
        System.out.println("Factorial = " + factorial);

    }
    
}
