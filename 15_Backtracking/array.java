public class array {

  public static void changeArray(int arr[], int si, int value) {
    // Base case
    if (si == arr.length) {
      printArray(arr);
      return;
    }

    // Recursion
    arr[si] = value;
    changeArray(arr, si+1, value+1); // function call step
    arr[si] = arr[si]-2; // Backtracking step
  }

  public static void printArray(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = new int[5];

    changeArray(arr, 0, 1);
    printArray(arr);
  }
}