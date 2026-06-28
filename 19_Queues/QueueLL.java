class QueueLL {

  // Node class
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  Node front = null;
  Node rear = null;

  // Check if empty
  boolean isEmpty() {
    return front == null;
  }

  // Enqueue (Insert)
  void add(int data) {
    Node newNode = new Node(data);

    // If queue is empty
    if (rear == null) {
      front = rear = newNode;
      return;
    }

    rear.next = newNode;
    rear = newNode;
  }

  // Dequeue (Remove)
  int remove() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }

    int result = front.data;
    front = front.next;

    // If queue becomes empty
    if (front == null) {
      rear = null;
    }

    return result;
  }

  // Peek
  int peek() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }
    return front.data;
  }

  // Display
  void display() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return;
    }

    Node temp = front;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    QueueLL q = new QueueLL();

    q.add(10);
    q.add(20);
    q.add(30);
    q.display();

    q.remove();
    q.display();

    System.out.println("Peek: " + q.peek());
  }
}