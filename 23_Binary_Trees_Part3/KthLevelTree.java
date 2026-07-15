// K-th Level Tree -O(n)

import java.util.LinkedList;
import java.util.Queue;

public class KthLevelTree {

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

  // Approach-1: Recursive (DFS)
  static void printKLevelRecursive(Node root, int level, int k) {
    if (root == null) {
      return;
    }

    if (level == k) {
      System.err.print(root.data + " ");
      return;
    }

    printKLevelRecursive(root.left, level + 1, k);
    printKLevelRecursive(root.right, level + 1, k);
  }

  // Approach-2: Level Order Traversal (BFS)
  static void printKLevelBFS(Node root, int k) {
    if (root == null) {
      return;
    }

    Queue<Node> q = new LinkedList<>();
    q.add(root);

    int level = 1;

    while (!q.isEmpty()) {
      int size = q.size();

      if (level == k) {
        while (size > 0) {
          size--;
          System.err.println(q.remove().data + " ");
        }
        return;
      }

      while (size > 0) {
        size--;
        Node curr = q.remove();

        if (curr.left != null) {
          q.add(curr.left);
        }

        if (curr.right != null) {
          q.add(curr.right);
        }
      }

      level++;
    }
  }


  public static void main(String[] args) {

    /*
            1
           / \
          2   3
         / \ / \
        4  5 6  7
     */

    Node root = new Node(1);

    root.left = new Node(2);
    root.right = new Node(3);

    root.left.left = new Node(4);
    root.left.right = new Node(5);

    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int k = 3;

    System.out.print("Nodes at Level " + k + ":\n");

    printKLevelRecursive(root, 1, k);

  }
}