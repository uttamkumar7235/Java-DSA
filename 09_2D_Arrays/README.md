# 09 📊 2D Arrays in Java

A 2D Array in Java is an array of arrays. It is commonly used to represent matrices, tables, grids, and board-based problems in Data Structures & Algorithms.

--- 

## 📌 What is a 2D Array?

A 2D array stores data in rows and columns.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### 📍 Indexing:

matrix[i][j] → element at row i, column j

--- 

## 🛠️ Declaration & Initialization

### 1️⃣ Declaration

```java
int[][] arr;
```

### 2️⃣ Allocation

```java
arr = new int[3][4]; // 3 rows, 4 columns
```

### 3️⃣ Declaration + Allocation

```java
int[][] arr = new int[2][3];
```

### 4️⃣ Direct Initialization

```java
int[][] arr = {
    {1, 2},
    {3, 4},
    {5, 6}
};
```

---

## 🔁 Traversing a 2D Array

### 1️⃣ Using Nested Loops

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

### 2️⃣ Using Enhanced For Loop

```java
for (int[] row : arr) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```

---

## ⌨️ Taking Input in 2D Array

```java
Scanner sc = new Scanner(System.in);
int rows = 3, cols = 3;
int[][] arr = new int[rows][cols];

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
    }
}
```

---

## 📐 Properties of 2D Arrays

- Stored as array of arrays
- Rows can have different lengths (Jagged Array)
- Default values:
  - 0 → int
  - false → boolean
  - null → reference types

---

## 🧩 Jagged Array Example

```java
int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[3];
jagged[2] = new int[1];
```

---

## 🧠 Common DSA Problems on 2D Arrays

✔ Matrix Traversal  
✔ Row-wise & Column-wise Sum  
✔ Transpose of Matrix  
✔ Search in Sorted Matrix  
✔ Spiral Matrix  
✔ Diagonal Sum  
✔ Rotate Matrix (90°)  
✔ Matrix Multiplication  
✔ Set Matrix Zeroes

---

## ⏱️ Time & Space Complexity

| Operation   | Complexity      |
| ----------- | --------------- |
| Traversal   | O(rows × cols)  |
| Search      | O(rows × cols)  |
| Extra Space | O(1) (in-place) |

---

## 🎯 Use Cases

- Game boards (Chess, Sudoku)
- Graph adjacency matrices
- Image processing
- Dynamic Programming tables

---

## 🚀 Key Interview Tips

- Always check rows and columns length
- Avoid hardcoding arr[0].length for jagged arrays
- Practice matrix patterns & traversal

---

## 📚 Conclusion

2D Arrays are fundamental for solving matrix-based DSA problems. Mastering traversal, indexing, and patterns is essential for coding interviews and competitive programming.

---

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this repository helpful, consider **starring it on GitHub!**
