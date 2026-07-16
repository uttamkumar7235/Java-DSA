import java.util.ArrayList;

public class RootToLeafPath {
  
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

  public static void printPath(ArrayList<Integer> path) {
    for (int i=0; i<path.size(); i++) {
      System.out.print(path.get(i) + "->");
    }
    System.out.println("Null");
  }

  public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
    if (root == null) {
      return;
    }

    // Add current node
    path.add(root.data);

    // Leaf node
    if (root.left == null && root.right == null) {
      printPath(path);
    }

    printRootToLeaf(root.left, path);
    printRootToLeaf(root.right, path);

    // Backtracking
    path.remove(path.size()-1);
  }

  public static void main(String[] args) {

    /*
              8
            /   \
           5     10
          / \      \
         3   6      11
                      \
                       14
  */
 
    int values[] = {8, 5, 3, 6, 10, 11, 14};

    Node root = null;

    for (int i=0; i<values.length; i++) {
      root = insert(root, values[i]);
    }

    printRootToLeaf(root, new ArrayList<Integer>());
  }
}
