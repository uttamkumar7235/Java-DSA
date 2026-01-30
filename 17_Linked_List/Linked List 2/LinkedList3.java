
// Zig-Zag Linked List

public class LinkedList3 {
  public static class Node {
    int data;
    Node next;

    public Node (int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public Node findMid() {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public void zigZag() {
    // find mid
    Node midNode = findMid();

    // reverse 2nd half of LL
    Node prev = null;
    Node curr = midNode.next; // 1st node of second half
    midNode.next = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    
    // alternate merge - zig-zag
    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    while (left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;

      // updation
      left = nextL;
      right = nextR;
    }
  }

  public static void main(String[] args) {
    LinkedList3 ll = new LinkedList3();
    ll.addFirst(6);
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);

    ll.print();
    ll.zigZag();
    ll.print();
  }
}
