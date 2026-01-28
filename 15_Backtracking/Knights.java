public class Knights {

  public static boolean isSafe(char board[][], int row, int col) {
    // 
  }

  public static void nKnights(char board[][], int row) {
    // Base case
    if (row == board.length) {
      printBoard(board);
      return;
    }

    // Coloumn loop
    for (int col=0; col<board.length; col++) {
      if (isSafe(board, row, col)) {
        board[row][col] = 'K';
        nKnights(board, row+1);
        board[row][col] = 'x';
      }
    }

  }
  
  public static void printBoard(char board[][]) {
    System.out.println("------ Chess Board ------");
    for (int i=0; i<board.length; i++) {
      for (int j=0; j<board.length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int n = 4;
    char board[][] = new char[n][n];
    
    // Initialization
    for (int i=0; i<board.length; i++) {
      for (int j=0; j<board.length; j++) {
        board[i][j] = 'x';
      }
    }

    nKnights(board, 0);
  }

}