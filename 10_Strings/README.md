# 10 📘 Strings in Java (DSA)

This section covers **Strings in Java** from **fundamentals to DSA-level problems**.  
Strings are one of the most frequently asked topics in **coding interviews**, **competitive programming**, and **real-world applications**.

---

## 🔹 What is a String in Java?

A **String** in Java is a sequence of characters.  
It is an **object** of the `String` class and is **immutable**, meaning its value cannot be changed once created.

```java
String s = "Hello";
```

---

## 🔹 String Memory Concept

Java stores strings in two memory areas:

### 1️⃣ String Constant Pool (SCP)

- Stores literal strings
- Saves memory by reusing existing objects

```java
String a = "Java";
String b = "Java"; // points to same object

```

### 2️⃣ Heap Memory

- Stores strings created using **new** keyword

```java
String c = new String("Java"); // new object
```

---

## 🔹 Immutability of String

Once a String is created, it cannot be modified.

```java
String s = "Hello";
s = s + " World"; // creates a new object
```

✔ Improves security, thread safety, and performance

---

## 🔹 String vs StringBuilder vs StringBuffer

| Feature     | String     | StringBuilder   | StringBuffer   |
| ----------- | ---------- | --------------- | -------------- |
| Mutable     | ❌ No       | ✅ Yes           | ✅ Yes          |
| Thread Safe | ✅ Yes      | ❌ No            | ✅ Yes          |
| Performance | Slow       | Fast            | Medium         |
| Use Case    | Fixed data | Single-threaded | Multi-threaded |

---

## Common String Methods

length()  
charAt()  
substring()  
equals()  
equalsIgnoreCase()  
compareTo()  
toUpperCase()  
toLowerCase()  
trim()  
replace()  
split()  
contains()  
indexOf()

---

## 🔹 Important String DSA Problems

### 🧠 Beginner

- Reverse a String
- Check Palindrome
- Count vowels & consonants
- Check Anagram

### ⚡ Intermediate

- Longest Common Prefix
- Longest Substring Without Repeating Characters
- String Compression
- Remove Duplicates

### 🔥 Advanced

- Pattern Matching (KMP Algorithm)
- Rabin–Karp Algorithm
- Z Algorithm
- Longest Palindromic Substring

---

## 🔹 Time & Space Complexity

| Operation              | Complexity |
| ---------------------- | ---------- |
| Access char            | O(1)       |
| Compare Strings        | O(n)       |
| Concatenation          | O(n)       |
| Pattern Matching (KMP) | O(n + m)   |

---

## 📌 Conclusion

Strings are a core DSA topic.  
Mastering them improves logic building, time complexity analysis, and interview confidence.  
Happy Coding! 🚀

---

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this repository helpful, consider **starring it on GitHub!**
