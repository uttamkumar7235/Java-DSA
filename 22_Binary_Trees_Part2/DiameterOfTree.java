// Diameter of the tree - O(n)

public class DiameterOfTree {

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

  static class Info {
    int diameter;
    int height;

    Info (int diameter, int height) {
      this.diameter = diameter;
      this.height = height;
    }
  }

  public static Info diameter (Node root) {

    if (root == null) {
      return new Info(0, 0);
    }

    Info leftInfo = diameter(root.left);
    Info rightInfo = diameter(root.right);

    int height = Math.max(leftInfo.height, rightInfo.height) + 1;

    int selfDiameter = leftInfo.height + rightInfo.height + 1;

    int diameter = Math.max(selfDiameter, Math.max(leftInfo.diameter, rightInfo.diameter));

    return new Info(diameter, height);
  }

  public static void main(String[] args) {

    /*
                  1
                /   \
               2     3
              / \
             4   5
     */

    Node root = new Node(1);

    root.left = new Node(2); 
    root.right = new Node(3);

    root.left.left = new Node(4);
    root.left.right = new Node(5);

    System.out.println("Diameter of the tree: " + diameter(root).diameter);
    
  }
}