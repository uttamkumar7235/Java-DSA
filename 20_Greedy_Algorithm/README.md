# 20 Greedy Algorithms in Java 💰

This repository contains Java implementations of classic **Greedy Algorithm** problems as part of my **Data Structures and Algorithms (DSA)** learning journey. These problems demonstrate how making the locally optimal choice at each step can lead to a globally optimal solution.

---

# 📚 Problems Covered

## 1. Activity Selection Problem

### Objective

Select the maximum number of non-overlapping activities from a given set of activities with start and finish times.

### Greedy Strategy

* Sort activities based on their finishing times.
* Always select the activity that finishes earliest.
* Continue selecting the next compatible activity.

### Time Complexity

* **O(n log n)** (Sorting)
* **O(n)** (Selection)

---

## 2. Fractional Knapsack Problem

### Objective

Maximize the total value that can be carried in a knapsack with limited capacity.

### Greedy Strategy

* Calculate the **Value/Weight ratio** for each item.
* Sort items in descending order of this ratio.
* Pick the highest ratio items first.
* Take fractions of items if necessary.

### Time Complexity

* **O(n log n)**

---

## 3. Minimum Absolute Difference of Pairs

### Objective

Find the minimum possible sum of absolute differences between corresponding elements of two arrays.

### Greedy Strategy

* Sort both arrays.
* Pair the smallest elements together, then the next smallest, and so on.
* Calculate the sum of absolute differences.

### Time Complexity

* **O(n log n)**

---

## 4. Maximum Length Chain of Pairs

### Objective

Find the maximum number of pairs that can form a chain where:

```text
(a, b) → (c, d)

if b < c
```

### Greedy Strategy

* Sort pairs by their ending values.
* Always choose the pair with the smallest ending value.
* Continue selecting compatible pairs.

### Time Complexity

* **O(n log n)**

---

## 5. Indian Coins Problem

### Objective

Find the minimum number of coins required to make a given amount.

### Greedy Strategy

* Sort coin denominations in descending order.
* Always choose the largest possible coin.
* Repeat until the amount becomes zero.

### Example

Amount = **590**

Coins selected:

```text
500 + 50 + 20 + 20
```

Minimum coins = **4**

### Time Complexity

* **O(n log n)** (if sorting is required)

---

## 6. Job Sequencing Problem

### Objective

Schedule jobs before their deadlines to maximize total profit.

Each job has:

* Deadline
* Profit

### Greedy Strategy

* Sort jobs in descending order of profit.
* Schedule each job in the latest available slot before its deadline.

### Time Complexity

* **O(n log n)**

---

# 🛠️ Concepts Learned

Through these implementations, I learned:

* Greedy choice property
* Optimal substructure
* Sorting using custom comparators
* Java `Comparator` interface
* Lambda expressions
* Array sorting with custom criteria
* Priority-based decision making
* Interval scheduling
* Profit maximization
* Resource optimization
* Pair matching strategies

---

# 📁 Java Files

* `ActivitySelection.java`
* `FractionalKnapsack.java`
* `MinimumAbsoluteDifference.java`
* `MaximumLengthChain.java`
* `IndianCoins.java`
* `JobSequencing.java`

---

# ⏱️ Time Complexity Summary

| Problem                     | Time Complexity |
| --------------------------- | --------------- |
| Activity Selection          | O(n log n)      |
| Fractional Knapsack         | O(n log n)      |
| Minimum Absolute Difference | O(n log n)      |
| Maximum Length Chain        | O(n log n)      |
| Indian Coins                | O(n log n)      |
| Job Sequencing              | O(n log n)      |

> **Note:** Most greedy problems require sorting, making **O(n log n)** the dominant time complexity.

---

# 📖 Key Greedy Principles

* Make the best local choice at every step.
* Never reconsider previous decisions.
* Greedy algorithms do **not** always produce the optimal solution, but they work efficiently for problems that satisfy:

  * **Greedy Choice Property**
  * **Optimal Substructure**

---

# 🎯 Learning Outcomes

After completing these problems, I gained practical experience with:

* Designing greedy algorithms
* Recognizing when a greedy approach is applicable
* Sorting with custom comparators in Java
* Solving optimization problems efficiently
* Analyzing time complexity
* Implementing interview-focused DSA problems

---

# 💡 Learning Goal

This repository documents my progress in mastering **Greedy Algorithms** using Java. These implementations strengthen my understanding of optimization techniques and improve my problem-solving skills for coding interviews and competitive programming.
