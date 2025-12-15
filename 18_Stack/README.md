# 18 📚 Stack in Java

A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle.  
The element added **last** is removed **first**.

---

## 🔑 Stack Operations

| Operation | Description |
|---------|-------------|
| `push()` | Insert element at top |
| `pop()` | Remove top element |
| `peek()` | View top element |
| `isEmpty()` | Check if stack is empty |

---

## 🧱 Stack Implementations in Java

### 1️⃣ Stack Using Array
```java
class Stack {
    int[] arr;
    int top = -1;
    int capacity;

    Stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        return isEmpty() ? -1 : arr[top];
    }
}
```

#### 👍 Advantages of Stack Using Array

- Simple & fast
- Better cache performance
- No extra memory overhead

#### ⚠️ Disadvantages

- Fixed size (overflow issue)
- Not dynamic like ArrayList


### 2️⃣ Stack Using ArrayList
```java
import java.util.ArrayList;

class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty() {
        return list.isEmpty();
    }

    void push(int data) {
        list.add(data);
    }

    int pop() {
        if (isEmpty()) return -1;
        return list.remove(list.size() - 1);
    }

    int peek() {
        if (isEmpty()) return -1;
        return list.get(list.size() - 1);
    }
}

```

#### 👍 Advantages of Stack Using ArrayList

- Dynamic size (no overflow)
- Easy implementation
- No fixed capacity

#### ⚠️ Disadvantages

- Slight overhead due to dynamic resizing
- Not thread-safe


### 3️⃣ Stack Using Linked List
```java
class Stack {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) return -1;
        int top = head.data;
        head = head.next;
        return top;
    }

    int peek() {
        return isEmpty() ? -1 : head.data;
    }
}

```

#### 👍 Advantages of Stack Using Linked List

- Dynamic size (no overflow)
- Efficient insertion & deletion
- No resizing cost

#### ⚠️ Disadvantages

- Extra memory for next pointer
- Slightly slower than array (cache misses)
  
---

## ⏱ Time Complexity

| Operation | Complexity |
| --------- | ---------- |
| Push      | O(1)       |
| Pop       | O(1)       |
| Peek      | O(1)       |

---

## 🆚 Comparison of Stack Implementations

| Implementation | Size    | Performance |
| -------------- | ------- | ----------- |
| Array          | Fixed   | Fastest     |
| ArrayList      | Dynamic | Fast        |
| Linked List    | Dynamic | Moderate    |

---

## 📌 Applications of Stack

- Function calls (Call Stack)
- Expression evaluation
- Undo / Redo operations
- Reversing a string
- Parenthesis checking
- Backtracking (DFS, Recursion)

---

## 🧠 LeetCode / DSA Stack Problems List

Stack is one of the most frequently asked data structures in coding interviews.  
Below is a **curated list of important Stack problems** from **LeetCode & DSA**.

---

### 🟢 Easy Level

| No. | Problem | Platform |
|----|--------|----------|
| 1 | Valid Parentheses | LeetCode |
| 2 | Implement Stack using Queues | LeetCode |
| 3 | Implement Queue using Stacks | LeetCode |
| 4 | Remove Outermost Parentheses | LeetCode |
| 5 | Backspace String Compare | LeetCode |
| 6 | Make The String Great | LeetCode |
| 7 | Baseball Game | LeetCode |
| 8 | Min Stack | LeetCode |
| 9 | Next Greater Element I | LeetCode |
|10 | Remove All Adjacent Duplicates in String | LeetCode |

---

### 🟡 Medium Level

| No. | Problem | Platform |
|----|--------|----------|
| 1 | Next Greater Element II | LeetCode |
| 2 | Daily Temperatures | LeetCode |
| 3 | Evaluate Reverse Polish Notation | LeetCode |
| 4 | Decode String | LeetCode |
| 5 | Simplify Path | LeetCode |
| 6 | Asteroid Collision | LeetCode |
| 7 | Online Stock Span | LeetCode |
| 8 | Score of Parentheses | LeetCode |
| 9 | Remove K Digits | LeetCode |
|10 | Sum of Subarray Minimums | LeetCode |

---

### 🔴 Hard Level

| No. | Problem | Platform |
|----|--------|----------|
| 1 | Largest Rectangle in Histogram | LeetCode |
| 2 | Maximal Rectangle | LeetCode |
| 3 | Trapping Rain Water | LeetCode |
| 4 | Basic Calculator | LeetCode |
| 5 | Basic Calculator II | LeetCode |

---

## 📌 Must-Know Stack Patterns

- Monotonic Stack
- Parenthesis Matching
- Expression Evaluation
- Stack + HashMap
- Stack Simulation
- Stack + Greedy

---

## 🎯 Interview Preparation Order

1️⃣ Valid Parentheses  
2️⃣ Min Stack  
3️⃣ Next Greater Element  
4️⃣ Daily Temperatures  
5️⃣ Largest Rectangle in Histogram  

---

## 🚀 Practice Tip

> **If you master monotonic stack problems, you can solve 70% of stack questions in interviews.**

---

⭐ Recommended Goal:
- Easy → 10 problems
- Medium → 8 problems
- Hard → 3 problems

---

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this helpful, don't forget to star the repository!

---
