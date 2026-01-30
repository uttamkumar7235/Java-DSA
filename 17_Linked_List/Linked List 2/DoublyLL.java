
// Doubly Linked List

public class DoublyLL {
  public static class Node {
    int data;
    Node next;
    Node prev;

    public Node (int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }

  }

  public static Node head;
  public static Node tail;
  public static int size; 

  // Add first
  public void addFirst(int data) {

    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
    }
    else {
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
    }
  }

  // Add last
  public void addLast(int data) {

    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }
    else {
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
      return;
    }
  }

  // Revove first
  public int removeFirst() {

    if (size == 0) {
      System.out.println("DLL is empty.");
      return Integer.MIN_VALUE;
    }

    else if (size == 1) {
      int value = head.data;
      head = tail = null;
      size--;
      return value;
    }

    else {
      int value = head.data;
      head = head.next;
      head.prev = null;
      size--;
      return value;
    }

  }
  
  // Remove last
  public int removeLast() {

    if (size == 0) {
      System.out.println("DLL is empty.");
      return Integer.MIN_VALUE;
    }
    else if (size == 1) {
      int value = tail.data;
      head = tail = null;
      size--;
      return value;
    }
    else {
      int value = tail.data;
      tail = tail.prev;
      tail.next = null;
      size--;
      return size;
    }

  }

  // Reverse a DLL
  public void reverse() {
    Node curr = head;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      curr.prev = next;

      prev = curr;
      curr = next;
    }
    head = prev;

  }

  // print
  public void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " <-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }
  
  public static void main(String[] args) {

    DoublyLL dll = new DoublyLL();

    dll.addFirst(5);
    dll.addFirst(4);
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);

    dll.addLast(10);

    dll.print();
    System.out.println("Size: " + dll.size);

    dll.removeFirst();
    dll.print();
    System.out.println("Size: " + dll.size);

    dll.removeLast();
    dll.print();
    System.out.println("Size: " + dll.size);

    dll.reverse();
    dll.print();
    System.out.println("Size: " + dll.size);

  }

}
