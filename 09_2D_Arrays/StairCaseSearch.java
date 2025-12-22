public class StairCaseSearch {

    // By comparing key with top-right element of the matrix
    public static boolean staircaseSearch1(int matrix[][], int key) {

        int row = 0, col = matrix[0].length-1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col]==key) {
                System.out.println("Key is found at (" + row + "," + col + ")");
                return true;
            }
            else if (key > matrix[row][col]) {
                row++; // moving towards bottom
            }
            else {
                col--; // moving towards left
            }
        }
        System.out.println("Key is not found in the matrix.");
        return false;
    }

    // By comparing key with top-right element of the matrix
    public static boolean staircaseSearch2(int matrix[][], int key) {

        int row = matrix.length-1, col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col]==key) {
                System.out.println("Key is found at (" + row + "," + col + ")");
                return true;
            }
            else if (key > matrix[row][col]) {
                col++; // moving towards bottom
            }
            else {
                row--; // moving towards left
            }
        }
        System.out.println("Key is not found in the matrix.");
        return false;
    }

    public static void main(String args[]) {

        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 33;
        
        staircaseSearch1(matrix,key);
        staircaseSearch2(matrix,key);

    }

}