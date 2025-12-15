// Stack using ArrayList

import java.util.ArrayList;

public class StackUsingArrayList {

    static class Stack {
        private ArrayList<Integer> list = new ArrayList<>();

        // Check empty
        boolean isEmpty() {
            return list.isEmpty();
        }

        // Push Operation
        void push(int data) {
            list.add(data);
            System.out.println(data + " pushed into stack");
        }

        // Pop Operation
        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        // Peek Operation
        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
