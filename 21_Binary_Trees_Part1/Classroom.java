// Diameter of a Tree (Approach 1) - O(n)

public class Classroom {

  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
    }
  }

  static int height (Node root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }

  static int diameter (Node root) {
    if (root == null) {
      return 0;
    }

    int leftHeight = height(root.left);
    int rightHeight = height(root.right);

    int selfDiameter = leftHeight + rightHeight + 1;

    int leftDiameter = diameter(root.left);
    int rightDiameter = diameter(root.right);

    int maxSubtreeDiameter = Math.max(leftDiameter, rightDiameter);

    return Math.max(selfDiameter, maxSubtreeDiameter);
  }

  public static void main(String[] args) {

    /*
            1
           / \
          2   3
         / \   \ 
        4  5    6
                 \
                  7
    */
   
    Node root = new Node(1);

    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right = new Node(6);
    root.right.right.right = new Node(7);

    System.out.println("Diameter of the tree: " + diameter(root));

  }
}
