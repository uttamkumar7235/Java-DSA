import java.util.*;

public class BinaryTree {

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

  static class BinaryTreeBuilder {
    static int idx = -1;

    public static Node buildTree(int nodes[]) {
      idx++;

      if (nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }

    // Preorder Traversal (Root Left Right)
    public static void preorder(Node root) {
      if (root == null) {
        return;
      }

      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    }

    // Inorder Traversal (Left Root Right)
    public static void inorder(Node root) {
      if (root == null) {
        return;
      }

      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }

    // Postorder Traversal (Left Right Root)
    public static void postorder(Node root) {
      if (root == null) {
        return;
      }

      postorder(root.left);
      postorder(root.right);
      System.out.print(root.data + " ");
    }

    // Level Order Traversal
    public static void levelOrder(Node root) {
      if (root == null) {
        return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          }
          else {
            q.add(null);
          }
        }
        else {
          System.out.print(currNode.data + " ");
          if (currNode.left != null) {
            q.add(currNode.left);
          }
          if (currNode.right != null) {
            q.add(currNode.right);
          }
        }
      }
    }

    // Height of a Tree (Node based)
    public static int height (Node root) {
      if (root == null) {
        return 0;
      }

      int leftHeight = height(root.left);
      int rightHeight = height(root.right);
      
      return Math.max(leftHeight, rightHeight) + 1;
    }

    // Total Nodes in a Tree
    public static int countNodes (Node root) {
      if (root == null) {
        return 0;
      }

      int leftCount = countNodes(root.left);
      int rightCount = countNodes(root.right);

      return leftCount + rightCount + 1;
    }

    // Sum of Nodes
    public static int sumOfNodes (Node root) {
      if (root == null) {
        return 0;
      }

      int leftSum = sumOfNodes(root.left);
      int rightSum = sumOfNodes(root.right);

      return leftSum + rightSum + root.data;
    }

  }

  public static void main(String[] args) {

    // Preorder representation of a Tree
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    BinaryTreeBuilder.idx = -1;
    Node root = BinaryTreeBuilder.buildTree(nodes);
    
    System.out.print("Preorder Traversal: ");
    BinaryTreeBuilder.preorder(root);

    System.out.print("\nInorder Traversal: ");
    BinaryTreeBuilder.inorder(root);

    System.out.print("\nPostorder Traversal: ");
    BinaryTreeBuilder.postorder(root);

    System.out.print("\nLevel Order Traversal:\n");
    BinaryTreeBuilder.levelOrder(root);

    System.out.println("Height of the tree: " + BinaryTreeBuilder.height(root));

    System.out.println("Total no. of Nodes: " + BinaryTreeBuilder.countNodes(root));

    System.out.println("Sum of Nodes: " + BinaryTreeBuilder.sumOfNodes(root));

  }
}