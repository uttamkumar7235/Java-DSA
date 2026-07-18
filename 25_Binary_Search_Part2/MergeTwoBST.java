import java.util.ArrayList;

public class MergeTwoBST {

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

  public static void getInorder(Node root, ArrayList<Integer> arr) {
    if (root == null) {
      return;
    }

    getInorder(root.left, arr);
    arr.add(root.data);
    getInorder(root.right, arr);
  }

  public static ArrayList<Integer> mergeArr(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {

    ArrayList<Integer> ans = new ArrayList<>();

    int i=0, j=0;

    while (i < arr1.size() && j < arr2.size()) {

      if (arr1.get(i) <= arr2.get(j)) {
        ans.add(arr1.get(i++));
      } 
      else {
        ans.add(arr2.get(j++));
      }
    }

    while (i < arr1.size()) {
      ans.add(arr1.get(i++));
    }

    while (j < arr2.size()) {
      ans.add(arr2.get(j++));
    }

    return ans;
  }

  public static Node buildBST(ArrayList<Integer> inorderList, int si, int ei) {
    if (si > ei) {
      return null;
    }

    int mid = (si + ei) / 2;

    Node root = new Node(inorderList.get(mid));

    root.left = buildBST(inorderList, si, mid - 1);
    root.right = buildBST(inorderList, mid + 1, ei);

    return root;
  }

  public static Node mergeBST(Node root1, Node root2) {

    ArrayList<Integer> arr1 = new ArrayList<>();
    getInorder(root1, arr1);

    ArrayList<Integer> arr2 = new ArrayList<>();
    getInorder(root2, arr2);

    ArrayList<Integer> finalArr = mergeArr(arr1, arr2);

    return buildBST(finalArr, 0, finalArr.size()-1);
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

    /*     BST 1
              2
             / \
            1   4
    */
    Node root1 = new Node(2);
    root1.left = new Node(1);
    root1.right = new Node(4);

    /*     BST 2
              9
             / \
            3  12
    */
    Node root2 = new Node(9);
    root2.left = new Node(3);
    root2.right = new Node(12);

    Node root = mergeBST(root1, root2);

    /*  Expected BST
              3
            /   \
          1       9
           \     / \
            2   4  12
    */

    preorder(root);
  }
}
