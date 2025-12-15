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

#### 👍 Advantages of Stack Using Array

- Simple & fast
- Better cache performance
- No extra memory overhead

#### ⚠️ Disadvantages

- Fixed size (overflow issue)
- Not dynamic like ArrayList


### 2️⃣ Stack Using ArrayList

#### 👍 Advantages of Stack Using ArrayList

- Dynamic size (no overflow)
- Easy implementation
- No fixed capacity

#### ⚠️ Disadvantages

- Slight overhead due to dynamic resizing
- Not thread-safe


### 3️⃣ Stack Using Linked List

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

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this helpful, don't forget to star the repository!

---
