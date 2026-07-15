public class BST {
  
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

  public static Node insert(Node root, int key) {
    if (root == null) {
      root = new Node(key);
      return root;
    }

    if (key < root.data) {
      root.left = insert(root.left, key);
    }

    else if (key > root.data) {
      root.right = insert(root.right, key);
    }

    return root;
  }

  public static void inorder(Node root) {
    if (root == null) {
      return;
    }

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
    int keys[] = {5, 2, 3, 4, 7};
    
    Node root = null;

    for(int i=0; i<keys.length; i++) {
      root = insert(root, keys[i]);
    }

    System.out.print("Inorder Traversal: ");
    inorder(root);
  }
}