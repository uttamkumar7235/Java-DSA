
// Find and remove Cycle in Linked List

public class LinkedList1 {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
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

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static boolean isCycle() {
    Node slow = head;
    Node fast = head; 
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true; // cycle is present
      }
    }
    return false; // cycle is not present
  }

  public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    Node prev = null;
    boolean cycle = false;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }

    if (cycle) {
      slow = head;

      while (slow != fast) {
        slow = slow.next; 
        prev = fast;
        fast = fast.next;
      }

      prev.next = null;
    }
    
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);

    ll.print();
    // 1->2->3->4->5->null

    head.next.next.next.next.next = head.next;
    // 1->2->3->4->5->2

    System.out.println("Cycle Present : " + isCycle());
    removeCycle();;
    ll.print();
  }
}
