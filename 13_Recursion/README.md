# 🔁 Recursion in Java

Recursion is a programming technique where a function calls itself to solve a problem by breaking it down into smaller subproblems.

---

## 📌 What is Recursion?

> **Recursion** is a method in which a function solves a problem by calling itself with a smaller input until a base condition is met.

Every recursive function has:
1. **Base Case** – stops recursion
2. **Recursive Case** – function calls itself

---

## 🧠 Why Use Recursion?

- Simplifies complex problems
- Natural fit for problems like:
  - Tree traversal
  - Divide & conquer
  - Backtracking
- Improves code readability (in some cases)

---

## ⚠️ When NOT to Use Recursion?

- When performance is critical
- When stack overflow risk exists
- When iterative solution is simpler

---

## 🧩 Basic Syntax

```java
returnType functionName(parameters) {
    if (baseCondition) {
        return value;
    }
    return functionName(smallerProblem);
}
```

---

## 🔁 Types of Recursion

### 1️⃣ Direct Recursion

Function calls itself directly.
```java
fun() {
    fun();
}
```

### 2️⃣ Indirect Recursion

Functions call each other.
```java
funA() → funB() → funA()
```

### 3️⃣ Tail Recursion

Recursive call is the last statement.
```java
public static void print(int n) {
    if (n == 0) return;
    System.out.println(n);
    print(n - 1);
}
```

---

## ⏱ Time & Space Complexity

| Factor | Explanation                          |
| ------ | ------------------------------------ |
| Time   | Depends on number of recursive calls |
| Space  | `O(n)` due to call stack             |

---

## 🧠 Recursion vs Iteration

| Recursion              | Iteration          |
| ---------------------- | ------------------ |
| Uses call stack        | Uses loops         |
| Cleaner logic          | Better performance |
| Risk of stack overflow | No stack overflow  |
| Easier for trees       | Easier for arrays  |
