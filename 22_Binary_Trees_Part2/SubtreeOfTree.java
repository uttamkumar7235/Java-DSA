public class SubtreeOfTree {

  static class Node {
    int data;
    Node left;
    Node right;

    Node (int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static boolean isIdentical(Node root, Node subRoot) {
    // Both trees are empty
    if (root == null && subRoot == null) {
      return true;
    }

    // One tree is empty
    if (root == null || subRoot == null) {
      return false;
    }

    // Data doesn't match
    if (root.data != subRoot.data) {
      return false;
    }

    return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
  }

  public static boolean isSubtree(Node root, Node subRoot) {
    if (subRoot == null) {
      return true;
    }

    if (root == null) {
      return false;
    }

    // Matching root found
    if (root.data == subRoot.data) {
      if (isIdentical(root, subRoot)) {
        return true;
      }
    }

    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
  }

  public static void main(String[] args) {
    
    /*
              1
            /   \
           2     3
          / \   / \
         4   5 6   7
    */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    /*
          2
         / \
        4   5       
    */

    Node subRoot = new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);

  }
}
