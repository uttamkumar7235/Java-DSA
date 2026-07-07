// Height and Depth of a Node (Node Based)

public class HeightAndDepthOfNode {

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

  // Find the node
  public static Node findNode(Node root, int target) {
    if (root == null) {
      return null;
    }

    if (root.data == target) {
      return root;
    }

    Node left = findNode(root.left, target);
    if (left != null) {
      return left;
    }

    return findNode(root.right, target);
  }

  // Calculate the height of subtree
  public static int height(Node root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }

  // Height of a particular node
  public static int heightOfNode(Node root, int target) {
    Node node = findNode(root, target);

    if (node == null) {
      return -1;
    }

    return height(node);

  }

  // Depth of a particular node
  public static int depthOfNode(Node root, int target, int level) {
    if (root == null) {
      return -1;
    }

    if (root.data == target) {
      return level;
    }

    int left = depthOfNode(root.left, target, level + 1);
    if (left != -1) {
      return left;
    }

    return depthOfNode(root.right, target, level + 1);
  }

  public static void main(String[] args) {

    /*
     *               1
     *             /   \
     *            2     3
     *           / \   / \
     *          4   5 6   7
     *             /
     *            8
     */

    Node root = new Node(1);

    root.left = new Node(2);
    root.right = new Node(3);

    root.left.left = new Node(4);
    root.left.right = new Node(5);

    root.right.left = new Node(6);
    root.right.right = new Node(7);

    root.left.right.left = new Node(8);

    int target = 2;

    System.out.println("\nHeight of node " + target + " = " + heightOfNode(root, target));

    System.out.println("Depth of node " + target + " = " + depthOfNode(root, target, 1));

  }
}