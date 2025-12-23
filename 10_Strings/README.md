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

## 🔍 String Comparison

String comparison is a frequently asked interview topic and a common source of bugs.

Java provides three main ways to compare strings:  
1. == Operator 
2. equals() Method  
3. compareTo() Method

### 1️⃣ == Operator (Reference Comparison)

Compares memory references, not content.

#### Example (String Literals)

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2); // true
```

✔ Same object in **String Constant Pool**

#### Example (Using new)

```java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2); // false
```

❌ Different objects in heap memory  
⚠ **Do not use `==` for content comparison**

### 2️⃣ equals() Method (Content Comparison)

Compares actual characters.

```java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1.equals(s2)); // true
```

✔ Most commonly used method

**Case-Insensitive Comparison**
```java
String s1 = "JAVA";
String s2 = "java";

System.out.println(s1.equalsIgnoreCase(s2)); // true
```

### 3️⃣ compareTo() Method (Lexicographical Comparison)

Compares strings character by character (Unicode).

**Return Values**  
- `0` → equal  
- `< 0` → first string smaller  
- `> 0` → first string greater

```java
String s1 = "apple";
String s2 = "banana";
String s3 = "apple";

System.out.println(s1.compareTo(s2)); // negative
System.out.println(s2.compareTo(s1)); // positive
System.out.println(s1.compareTo(s3)); // 0
```

**Case-Insensitive compareTo**
```java
String s1 = "Apple";
String s2 = "apple";

System.out.println(s1.compareToIgnoreCase(s2)); // 0
```
### 🔁 String Comparison Summary
| Method                  | Comparison Type               | Use Case          |
| ----------------------- | ----------------------------- | ----------------- |
| `==`                    | Reference                     | Rarely used       |
| `equals()`              | Content                       | ✅ Most common     |
| `equalsIgnoreCase()`    | Content (ignore case)         | User input        |
| `compareTo()`           | Lexicographical               | Sorting           |
| `compareToIgnoreCase()` | Lexicographical (ignore case) | Case-free sorting |

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

## 🔹 Common String Methods

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
