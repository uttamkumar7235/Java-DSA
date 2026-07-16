public class DeleteBST {

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

  // Insert
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

  // Delete
  public static Node delete(Node root, int val) {
    if (root == null) {
      return null;
    }

    // Search the Node
    if (val < root.data) {
      root.left = delete(root.left, val);
    }

    else if (val > root.data) {
      root.right = delete(root.right, val);
    }

    // Node Found
    else {

      // Case 1: No child
      if (root.left == null && root.right == null) {
        return null;
      }

      // Case 2: One child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      // Case 3: Two children
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = delete(root.right, IS.data);
    }

    return root;
  }

  // Inorder Successor
  public static Node findInorderSuccessor(Node root) {
    while (root.left != null) {
      root = root.left;
    }

    return root;
  }

  // Inorder
  public static void inorder(Node root) {
    if (root == null) {
      return;
    }

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
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

    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }

    System.out.println("Before Deletion:");
    inorder(root);

    root = delete(root, 5);

    System.out.println("\nAfter Deletion:");
    inorder(root);
  }
}
