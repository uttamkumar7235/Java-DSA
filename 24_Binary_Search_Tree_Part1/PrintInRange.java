public class PrintInRange {
  
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }

    if (val < root.data) {
      root.left = insert(root.left, val);
    }

    else if (val > root.data) {
      root.right = insert(root.right, val);
    }

    return root;
  }

  public static void printInRange(Node root, int k1, int k2) {
    if (root == null) {
      return;
    }

    if (root.data >= k1 && root.data <= k2) {
      printInRange(root.left, k1, k2);
      System.out.print(root.data + " ");
      printInRange(root.right, k1, k2);
    }

    else if (root.data < k1) {
      printInRange(root.right, k1, k2);
    }

    else {
      printInRange(root.left, k1, k2);
    }
  }

  public static void main(String[] args) {

    /*
              8
            /   \
           5     10
          / \      \
         3   6      11
        / \    \      \
       1   4    7      14
  */
 
    int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

    Node root = null;

    for (int i=0; i<values.length; i++) {
      root = insert(root, values[i]);
    }

    int k1 = 5;
    int k2 = 10;

    printInRange(root, k1, k2);
  }
}
