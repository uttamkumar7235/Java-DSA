public class LinkedList {

  public static class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int size;

  // Methods

  // Add first - O(1)
  public void addFirst(int data) {
    // Step-1 Create newNode
    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }

    // Step-2 newNode next = head
    newNode.next = head;

    // Step-3 head = newNode
    head = newNode;
  }

  // Add last - O(1)
  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;

    if(head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;

  }

  public void print() {
    if (head == null) {
      System.out.println("LinkedList is empty.");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // Add in the middle
  public void add (int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }

    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while (i < idx-1) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;

  }

  public int removeFirst() {

    if (size == 0) {
      System.out.println("LL is empty.");
      return Integer.MIN_VALUE;
    }
    else if (size == 1) {
      int value = head.data;
      head = tail = null;
      size--;
      return value;
    }

    int value = head.data;
    head = head.next;
    size--;
    return value;

  }

  public int removeLast() {

    if (size == 0) {
      System.out.println("LL is empty.");
      return Integer.MIN_VALUE;
    }
    else if (size == 1) {
      int value = tail.data;
      head = tail = null;
      size--;
      return value;
    }

    Node temp = head;
    int i = 0;

    while (i < size-2) {
      temp = temp.next;
      i++;
    }
    int value = tail.data;
    temp.next = null;
    tail = temp;
    size--;

    return value;

  }

  public int iterativeSearch (int key) {

    Node temp = head;
    for (int i=0; i<size; i++) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
    }

    return -1;
  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }

    if (head.data == key) {
      return 0;
    }

    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }
    return idx+1;
  }

  public int recursiveSearch (int key) {
    return helper(head, key);
  }

  public void reverse () {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  // Find and remove nth node from end

  public void deleteNthfromEnd (int n) {
    // Calculate size
    int sz = 0;
    Node temp = head;
    
    while (temp != null) {
      temp = temp.next;
      sz++;
    }

    if (n == sz) {
      head = head.next;
      return;
    }

    // size-n
    int i=1;
    int iToFind = sz-n;
    Node prev = head;
    
    while (i < iToFind) {
      prev = prev.next;
      i++;
    }

    prev.next = prev.next.next;
    return;

  }

  // Check Palindrome

  public Node findMidNode(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }

  public boolean checkPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }

    // Step-1 find mid node
    Node midNode = findMidNode(head);

    // Step-2 Reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    // Step-3 check 1st half and 2nd half
    Node left = head;
    Node right = prev;

    while (right != null) {
      if (left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;
    
  }


  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(4);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(5);
    ll.addLast(6);
    ll.add(2, 3);
    ll.print();
    // System.out.println("Size of LL : " + ll.size);

    // System.out.println("Removed first node :" + ll.removeFirst());
    // ll.print();
    // System.out.println("Size of LL : " + ll.size);

    // System.out.println("Removed last node : " + ll.removeLast());
    // ll.print();
    // System.out.println("Size of LL : " + ll.size);

    // System.out.println("Index of key 5 = " + ll.iterativeSearch(5));
    // System.out.println("Index of key 10 = " + ll.iterativeSearch(10));

    // System.out.println("Index of key 5 = " + ll.recursiveSearch(5));
    // System.out.println("Index of key 10 = " + ll.recursiveSearch(10));

    // ll.reverse();
    // ll.print();

    // ll.deleteNthfromEnd(3);
    // ll.print();
  
  }
}