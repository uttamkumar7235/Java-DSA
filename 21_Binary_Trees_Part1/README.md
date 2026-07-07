# 21 Binary Trees in Java (Part 1) 🌳

This repository contains my Java implementations of **Binary Tree** concepts as part of my **Data Structures and Algorithms (DSA)** learning journey. The programs focus on recursive tree algorithms, traversals, tree properties, and interview-oriented problems.

---

# 📚 Topics Covered

## 1. Binary Tree Construction

- Build a binary tree using **Preorder Traversal**.
- Use `-1` to represent `null` nodes.
- Construct the tree recursively.

---

## 2. Tree Traversals

Implemented all four basic traversals:

- ✅ Preorder Traversal (Root → Left → Right)
- ✅ Inorder Traversal (Left → Root → Right)
- ✅ Postorder Traversal (Left → Right → Root)
- ✅ Level Order Traversal (Breadth-First Search using Queue)

---

## 3. Basic Tree Operations

Implemented recursive algorithms for:

- 🌳 Height of a Binary Tree
- 🔢 Count Total Number of Nodes
- ➕ Sum of All Nodes

---

## 4. Height & Depth of a Particular Node

Implemented recursive algorithms to find the **height** and **depth** of any node in a binary tree using both **Edge-Based** and **Node-Based** definitions.

### Edge-Based Definition

- **Height:** Number of **edges** in the longest path from the node to a leaf.
- **Depth:** Number of **edges** from the root to the given node.

### Node-Based Definition

- **Height:** Number of **nodes** in the longest path from the node to a leaf.
- **Depth:** Number of **nodes** from the root to the given node.

---

## 5. Diameter of a Binary Tree

Implemented the **Brute Force (Approach 1)** solution to find the diameter of a binary tree.

### Definition

The **diameter** of a binary tree is the **number of nodes on the longest path between any two nodes**.

### Approach

For every node:

1. Calculate the height of the left subtree.
2. Calculate the height of the right subtree.
3. Compute the diameter passing through the current node:

```text
Diameter = Left Height + Right Height + 1
```

4. Recursively compute the diameter of the left and right subtrees.
5. Return the maximum of:

- Diameter through the current node
- Left subtree diameter
- Right subtree diameter

### Time Complexity

- **O(n²)**

Reason:

- Height calculation takes **O(n)**.
- Height is recalculated for every node.

### Space Complexity

- **O(h)**

where `h` is the height of the tree due to the recursion stack.

---

# 🛠️ Concepts Learned

Through these implementations, I learned:

- Binary Tree representation
- Recursive tree construction
- Recursive traversal techniques
- Breadth-First Search (BFS)
- Queue implementation using `LinkedList`
- Height of a Binary Tree
- Height of a Particular Node
- Depth of a Particular Node
- Difference between Edge-Based and Node-Based definitions
- Counting total nodes
- Sum of all nodes
- Diameter of a Binary Tree
- Recursive divide-and-conquer techniques
- Relationship between tree height and diameter
- Time complexity analysis of recursive tree algorithms

---

# 🌳 Example Trees

## Tree 1 (Traversal & Basic Operations)

Preorder representation:

```text
1 2 4 -1 -1 5 -1 -1 3 -1 6 -1 -1
```

Constructed tree:

```text
        1
      /   \
     2     3
    / \     \
   4   5     6
```

---

## Tree 2 (Height & Depth of a Particular Node)

```text
              1
            /   \
           2     3
          / \   / \
         4   5 6   7
            /
           8
```

### Edge-Based

| Node | Height | Depth |
|------|-------:|------:|
| 1 | 3 | 0 |
| 2 | 2 | 1 |
| 5 | 1 | 2 |
| 8 | 0 | 3 |

### Node-Based

| Node | Height | Depth |
|------|-------:|------:|
| 1 | 4 | 1 |
| 2 | 3 | 2 |
| 5 | 2 | 3 |
| 8 | 1 | 4 |

---

## Tree 3 (Diameter Problem)

```text
            1
           / \
          2   3
         / \   \
        4   5   6
                 \
                  7
```

Longest path:

```text
4 → 2 → 1 → 3 → 6 → 7
```

Diameter = **6 nodes**

---

# 📤 Sample Outputs

## Binary Tree Operations

```text
Preorder Traversal: 1 2 4 5 3 6

Inorder Traversal: 4 2 5 1 3 6

Postorder Traversal: 4 5 2 6 3 1

Level Order Traversal:
1
2 3
4 5 6

Height of the Tree: 3
Total Number of Nodes: 6
Sum of Nodes: 21
```

---

## Height & Depth of a Particular Node

### Edge-Based

```text
Target Node = 2

Height of node = 2
Depth of node = 1
```

### Node-Based

```text
Target Node = 2

Height of node = 3
Depth of node = 2
```

---

## Diameter of Binary Tree

```text
Diameter of the tree: 6
```

---

# ⏱️ Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Build Tree | O(n) |
| Preorder Traversal | O(n) |
| Inorder Traversal | O(n) |
| Postorder Traversal | O(n) |
| Level Order Traversal | O(n) |
| Height of Tree | O(n) |
| Count Nodes | O(n) |
| Sum of Nodes | O(n) |
| Height of a Particular Node | O(n) |
| Depth of a Particular Node | O(n) |
| Diameter (Approach 1 - Brute Force) | O(n²) |

---

# 📁 Java Files

### `BinaryTree.java`

- Build Binary Tree
- Preorder Traversal
- Inorder Traversal
- Postorder Traversal
- Level Order Traversal
- Height of Tree
- Count Nodes
- Sum of Nodes

---

### `HeightAndDepthOfNode.java`

- Height of a Particular Node
- Depth of a Particular Node
- Node-Based Implementation

---

### `Classroom.java`

- Diameter of Binary Tree (Approach 1 - Brute Force)

---

# 🚀 Upcoming Topics

- Diameter of Binary Tree (Optimized O(n))
- Identical Trees
- Subtree of Another Tree
- Top View of Binary Tree
- Kth Level of Tree
- Lowest Common Ancestor (LCA)
- Minimum Distance Between Nodes
- Kth Ancestor
- Transform to Sum Tree

---

# 💡 Learning Goal

This repository documents my progress in learning **Binary Trees using Java**. Each program strengthens my understanding of recursion, tree traversals, divide-and-conquer algorithms, and interview-oriented DSA concepts.

The goal is to build a comprehensive collection of Binary Tree algorithms with clean Java implementations, detailed documentation, and complexity analysis to prepare for software engineering interviews.
