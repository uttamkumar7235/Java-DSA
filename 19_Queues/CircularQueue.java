public class CircularQueue {
  int arr[];
  int front, rear, size;

  CircularQueue(int n) {
    size = n;
    arr = new int[size];
    front = rear = -1;
  }

  boolean isEmpty() {
    return front == -1;
  }

  boolean isFull() {
    return (rear + 1) % size == front;
  }

  // Enqueue
  void add(int data) {
    if (isFull()) {
      System.out.println("Queue is Full");
      return;
    }

    // First element
    if (front == -1) {
      front = 0;
    }

    rear = (rear + 1) % size;
    arr[rear] = data;
  }

  // Dequeue
  int remove() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }

    int result = arr[front];

    // Single element case
    if (front == rear) {
      front = rear = -1;
    } else {
      front = (front + 1) % size;
    }

    return result;
  }

  // Peek
  int peek() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    }
    return arr[front];
  }

  // Display
  void display() {
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return;
    }

    int i = front;
    while (true) {
      System.out.print(arr[i] + " ");
      if (i == rear)
        break;
      i = (i + 1) % size;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    CircularQueue q = new CircularQueue(5);

    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.display();

    q.remove();
    q.remove();

    q.add(50);
    q.add(60); 

    q.display();
  }
}