// Simple Queue (Linear Queue using Array)

public class SimpleQueue {
  int arr[];
  int front, rear, size;

  SimpleQueue(int n) {
    size = n;
    arr = new int[size];
    front = 0;
    rear = -1;
  }

  // isEmpty()
  boolean isEmpty() {
    return rear < front;
  }

  // Enqueue
  void add(int data) {
    if (rear == size-1) {
      System.out.println("Queue is full");
      return;
    }

    rear++;
    arr[rear] = data;
  }

  // Dequeue
  int remove() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return -1;
    }

    int val = arr[front];
    front++;
    return val;
  }

  // Peek
  int peek() {
    if (isEmpty()) {
      return -1;
    }

    return arr[front];
  }

  public static void main(String[] args) {
    SimpleQueue q = new SimpleQueue(5); 
    
    System.out.println(q.isEmpty());
    q.add(10);
    q.add(20);
    System.out.println(q.peek());
    q.remove();
    System.out.println(q.peek());
  }
}
