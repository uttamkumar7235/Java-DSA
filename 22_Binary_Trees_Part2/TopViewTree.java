// Top View of a Tree - O(n)

import java.util.*;

public class TopViewTree {
  
  static class Node {
    int data;
    Node left, right;

    Node (int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class Info {
    Node node;
    int hd; // horizontal distance

    Info (Node node, int hd) {
      this.node = node;
      this.hd = hd;
    }
  }

  public static void topView (Node root) {
    if (root == null) {
      return;
    }

    Queue<Info> q = new LinkedList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    int min = 0;
    int max = 0;

    q.add(new Info(root, 0));

    while (!q.isEmpty()) {
      Info curr = q.remove();

      // Store only the first node for each HD
      if (!map.containsKey(curr.hd)) {
        map.put(curr.hd, curr.node.data);
      }

      if (curr.node.left != null) {
        q.add(new Info(curr.node.left, curr.hd-1));
        min = Math.min(min, curr.hd-1);
      }

      if (curr.node.right != null) {
        q.add(new Info(curr.node.right, curr.hd+1));
        max = Math.max(max, curr.hd+1);
      }

    }
    
    for (int i=min; i<=max; i++) {
      System.out.print(map.get(i) + " ");
    }

  }

  public static void main(String[] args) {
    
    /*
            1
           / \
          2   3
           \   \
            4   5
             \
              6
    */

    Node root = new Node(1);

    root.left = new Node(2);
    root.right = new Node(3);

    root.left.right = new Node(4);
    root.right.right = new Node(5);

    root.left.right.right = new Node(6);

    topView(root);
  }
}
