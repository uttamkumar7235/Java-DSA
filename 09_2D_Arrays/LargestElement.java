public class LargestElement {

    public static int findLargest(int matrix[][]) {

        int largest = Integer.MIN_VALUE;
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }

    public static void main (String args[]) {

        int[][] matrix = {
            {3, 7, 1},
            {9, 2, 5},
            {4, 8, 6}
        };

        System.out.println("Largest element = " + findLargest(matrix));
    }
}