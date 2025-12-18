# 08 Basic Sorting Algorithms in Java

This repository contains **basic sorting algorithms** implemented in **Java**, along with clear explanations, examples, and complexity analysis. It is ideal for **DSA beginners**, **college exams**, and **interview preparation**.

---

## 📌 What is Sorting?

Sorting is the process of arranging elements in a particular order:

* 🔼 Ascending order (small → large)
* 🔽 Descending order (large → small)

Sorting improves:

* Searching efficiency
* Data organization
* Overall algorithm performance

---

## 📂 Algorithms Covered

### 1️⃣ Bubble Sort

* Repeatedly compares adjacent elements
* Swaps them if they are in the wrong order
* Largest element moves to the end in each pass

**Time Complexity:**

* Best Case: `O(n)` (already sorted)
* Average Case: `O(n²)`
* Worst Case: `O(n²)`

**Space Complexity:** `O(1)`

---

### 2️⃣ Selection Sort

* Selects the minimum element from the unsorted part
* Places it at the beginning of the array
* Number of swaps is minimum

**Time Complexity:**

* Best / Average / Worst Case: `O(n²)`

**Space Complexity:** `O(1)`

---

### 3️⃣ Insertion Sort

* Builds the sorted array one element at a time
* Similar to sorting playing cards in hand
* Efficient for small or nearly sorted datasets

**Time Complexity:**

* Best Case: `O(n)`
* Average Case: `O(n²)`
* Worst Case: `O(n²)`

**Space Complexity:** `O(1)`

---

### 4️⃣ Counting Sort

* A **non-comparison-based sorting algorithm**
* Counts the frequency of each element
* Works best when the **range of values is small**

**Time Complexity:**

* Best / Average / Worst Case: `O(n + k)`

  * `n` = number of elements
  * `k` = range of input values

**Space Complexity:** `O(n + k)`

---

## 🧠 Comparison Table

| Algorithm      | Best Case | Average Case | Worst Case | Stable | In-Place    |
| -------------- | --------- | ------------ | ---------- | ------ | --------    |
| Bubble Sort    | O(n)      | O(n²)        | O(n²)      | ✅ Yes  | ✅ Yes    |
| Selection Sort | O(n²)     | O(n²)        | O(n²)      | ❌ No   | ✅ Yes    |
| Insertion Sort | O(n)      | O(n²)        | O(n²)      | ✅ Yes  | ✅ Yes    |
| Counting Sort  | O(n + k)  | O(n + k)     | O(n + k)   | ✅ Yes  | ❌ No     |

---

## 🧪 Example

**Input:**

```
[5, 1, 4, 2, 8]
```

**Output:**

```
[1, 2, 4, 5, 8]
```

---

## 🎯 When to Use Which Algorithm?

* ✅ **Bubble Sort:** Learning basics, very small datasets
* ✅ **Selection Sort:** When memory writes are costly
* ✅ **Insertion Sort:** Nearly sorted arrays
* ✅ **Counting Sort:** Integers with limited range (marks, frequencies)

---

## 🚀 How to Run

```bash
javac BubbleSort.java
java BubbleSort
```

(Replace filename as needed)

---

## 📚 Learning Purpose

This repository is created for:

* 📘 Understanding sorting fundamentals
* 🧠 Strengthening DSA concepts
* 💼 Interview & exam preparation

---

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this repository helpful, consider **starring it on GitHub!**
