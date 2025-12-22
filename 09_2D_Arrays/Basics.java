// Basics of 2D Array (Matrix)

import java.util.*;

public class Basics {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        // Declaring the matrix
        int matrix [][] = new int [3][3];
        int m = matrix.length; // No. of rows
        int n = matrix[0].length; // No. of columns

        // Inserting the elements
        System.out.println("Enter the elements : ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                matrix [i][j] = sc.nextInt();
            }
        }

        // Printing the matrix
        System.out.println("The elements are : ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}