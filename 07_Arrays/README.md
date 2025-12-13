# 07 Arrays 📘

---

## 📌 Introduction

An **array** in Java is a collection of **similar data types** stored in a **contiguous memory location**. Arrays allow us to store multiple values using a **single variable name**.

✨ Why arrays?

* 🗂 Store multiple values efficiently
* ⚡ Fast access using index
* 🔁 Easy traversal using loops
* 🧠 Foundation for DSA

---

## 🔹 Array Declaration & Initialization 🧾

### ▶ Declaration

```java
int[] arr;
```

### ▶ Allocation

```java
arr = new int[5];
```

### ▶ Declaration + Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

---

## 🔹 Accessing Array Elements 🎯

Array index starts from **0**.

```java
int[] arr = {10, 20, 30};
System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
```

---

## 🔹 Types of Arrays in Java 🧠

### 1️⃣ One-Dimensional Array

```java
int[] numbers = {1, 2, 3, 4};
```

Traversal:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

---

### 2️⃣ Two-Dimensional Array (Matrix) 📊

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Traversal:

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

### 3️⃣ Jagged Array (Irregular Array) 🧩

Arrays with different column sizes.

```java
int[][] jagged = new int[3][];
jagged[0] = new int[]{1, 2};
jagged[1] = new int[]{3, 4, 5};
jagged[2] = new int[]{6};
```

---

## 🔹 Enhanced For Loop (For-Each) 🔄

```java
int[] arr = {10, 20, 30};
for (int x : arr) {
    System.out.println(x);
}
```

✔ Simple and readable
✔ Best for traversal only

---

## 🔹 Common Array Operations 🛠

### ▶ Find Length

```java
int len = arr.length;
```

### ▶ Update Element

```java
arr[1] = 99;
```

### ▶ Sum of Elements

```java
int sum = 0;
for (int x : arr) {
    sum += x;
}
```

---

## 🔹 Array vs ArrayList ⚖️

| Feature     | Array               | ArrayList       |
| ----------- | ------------------- | --------------- |
| Size        | Fixed 📏            | Dynamic 🔄      |
| Data Type   | Primitive + Objects | Objects only    |
| Performance | Faster ⚡            | Slightly slower |

---

## 🔹 Important Points 📝

✔ Array size is fixed once created
✔ Index starts from 0
✔ `ArrayIndexOutOfBoundsException` if index is invalid ❌
✔ Arrays are objects in Java

---

## 🚦 Example: Find Maximum Element 🔍

```java
static int findMax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
```

---

## 🎯 Conclusion

Arrays are the **building blocks of data structures** 🧱. A strong understanding of arrays is essential before moving to **Linked Lists, Stacks, Queues, and Trees**.

---
