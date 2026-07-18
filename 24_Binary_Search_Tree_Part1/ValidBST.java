public class ValidBST {

  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
    }
  }

  public static boolean isValidBST(Node root, Node min, Node max) {

    // Empty tree is always a BST
    if (root == null) {
      return true;
    }

    // Current node should be greater than min
    if (min != null && root.data <= min.data) {
      return false;
    }

    // Current node should be smaller than max
    if (max != null && root.data >= max.data) {
      return false;
    }

    return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
  }

  public static void main(String[] args) {

    /*
              8
            /   \
           5     10
          / \      \
         3   6      11
    */

    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right.right = new Node(11);

    System.out.println(isValidBST(root, null, null));
  }
}
