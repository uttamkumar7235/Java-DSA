// Stack using Array

public class StackUsingArray {

    static class Stack {
        int[] arr;
        int top;
        int capacity;

        // Constructor
        Stack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        // Check if stack is empty
        boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        boolean isFull() {
            return top == capacity - 1;
        }

        // Push operation
        void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = data;
        }

        // Pop operation
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        // Peek operation
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

