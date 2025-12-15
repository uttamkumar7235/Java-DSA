// Stack Using LinkedList

public class StackUsingLinkedList {
    
    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Stack class
    static class Stack {
        Node head = null; // top of stack

        // check empty
        boolean isEmpty() {
            return head == null;
        }

        // Push operation
        void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Pop operation
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek operation
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    
}
