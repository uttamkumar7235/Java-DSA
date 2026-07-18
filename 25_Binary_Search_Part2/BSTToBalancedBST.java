import java.util.ArrayList;

public class BSTToBalancedBST {

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

  public static void getInorder(Node root, ArrayList<Integer> inorderList) {
    if (root == null) {
      return;
    }

    getInorder(root.left, inorderList);
    inorderList.add(root.data);
    getInorder(root.right, inorderList);
  }

  public static Node buildBST(ArrayList<Integer> inorderList, int si, int ei) {
    if (si > ei) {
      return null;
    }

    int mid = (si+ei)/2;

    Node root = new Node(inorderList.get(mid));

    root.left = buildBST(inorderList, si, mid-1);
    root.right = buildBST(inorderList, mid+1, ei);

    return root;
  }

  public static Node balancedBST(Node root) {
    // Inorder Sequence
    ArrayList<Integer> inorderList = new ArrayList<>();
    getInorder(root, inorderList);

    // Inorder Seq -> Balanced BST
    root = buildBST(inorderList, 0, inorderList.size()-1);

    return root;
  }

  public static void preorder(Node root) {
    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  public static void main(String[] args) {
    /*       Given BST
                  8
                /   \
               6     10
              /       \
             5         11
            /           \
           3             12 
    */

    Node root = new Node(8);
    root.left = new Node(6);
    root.right = new Node(10);
    root.left.left = new Node(5);
    root.right.right = new Node(11);
    root.left.left.left = new Node(3);
    root.right.right.right = new Node(12);

    /*   Expected BST
              8
            /   \
           5     11
          / \    / \
         3   6  10  12
    */

    root = balancedBST(root);
    preorder(root);
    
  }
}
