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

## 🧠 Important DSA Problems for Arrays

### 🟢 Easy Level (Foundations)

| No. | Problem                               | Key Concept  |
| --- | ------------------------------------- | ------------ |
| 1   | Find Largest / Smallest Element       | Traversal    |
| 2   | Reverse an Array                      | Two Pointers |
| 3   | Check if Array is Sorted              | Traversal    |
| 4   | Remove Duplicates from Sorted Array   | Two Pointers |
| 5   | Rotate Array by K Steps               | Rotation     |
| 6   | Move Zeroes to End                    | Two Pointers |
| 7   | Second Largest Element                | Tracking     |
| 8   | Linear Search                         | Searching    |
| 9   | Find Missing Number                   | Math / XOR   |
| 10  | Maximum Subarray Sum (Kadane – Intro) | Prefix Sum   |



### 🟡 Medium Level (Most Asked)

| No. | Problem                           | Key Pattern          |
| --- | --------------------------------- | -------------------- |
| 1   | Two Sum                           | Hashing              |
| 2   | Best Time to Buy and Sell Stock   | Greedy               |
| 3   | Majority Element                  | Moore’s Voting       |
| 4   | Subarray Sum Equals K             | Prefix Sum + HashMap |
| 5   | Kadane’s Algorithm (Max Subarray) | Dynamic Programming  |
| 6   | Sort Colors (0,1,2)               | Dutch National Flag  |
| 7   | Merge Intervals                   | Sorting              |
| 8   | Product of Array Except Self      | Prefix & Suffix      |
| 9   | Find Duplicate Number             | Cycle Detection      |
| 10  | Longest Consecutive Sequence      | HashSet              |



### 🔴 Hard Level (Advanced)

| No. | Problem                     | Key Idea      |
| --- | --------------------------- | ------------- |
| 1   | Trapping Rain Water         | Two Pointers  |
| 2   | Maximum Product Subarray    | DP            |
| 3   | Sliding Window Maximum      | Deque         |
| 4   | Count Inversions            | Merge Sort    |
| 5   | Median of Two Sorted Arrays | Binary Search |

---

## 📌 Must-Know Array Patterns

- Two Pointers
- Sliding Window
- Prefix Sum
- Hashing
- Kadane’s Algorithm
- Greedy
- Binary Search on Answer

--- 

## 🎯 Interview Preparation Order (Recommended)

1️⃣ Reverse Array

2️⃣ Two Sum

3️⃣ Kadane’s Algorithm

4️⃣ Best Time to Buy & Sell Stock

5️⃣ Subarray Sum Equals K

6️⃣ Trapping Rain Water

--- 

## 🚀 Practice Tip

If you master 20–25 array problems with patterns, you can solve most interview array questions.

--- 

## 🎯 Conclusion

Arrays are the **building blocks of data structures** 🧱. A strong understanding of arrays is essential before moving to **Linked Lists, Stacks, Queues, and Trees**.

---

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this helpful, don't forget to star the repository!
