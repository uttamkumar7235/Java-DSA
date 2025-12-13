# 06 Functions and Methods

## 📌 Introduction

🚀 In Java, **functions** are commonly referred to as **methods**. A method is a block of code that performs a specific task and runs only when it is called. Methods help in **code reusability, modularity, readability, and maintainability**.

---

## 🔹 What is a Method in Java? 🤔

A **method** is a set of statements grouped together to perform an operation.

### General Syntax 🧾

```java
accessModifier returnType methodName(parameters) {
    // method body
}
```

### 🔹 Example

```java
public int add(int a, int b) {
    return a + b;
}
```

---

## 🔹 Why Use Methods?

* Avoid code repetition
* Improve readability
* Easy debugging and testing
* Supports modular programming
* Makes large programs manageable

---

## 🔹 Types of Methods in Java

### 1️⃣ Predefined Methods

Methods already defined in Java libraries.

**Examples:**

* `System.out.println()`
* `Math.sqrt()`
* `String.length()`

```java
System.out.println("Hello Java");
double r = Math.sqrt(16);
```

---

### 2️⃣ User-Defined Methods

Methods created by programmers to perform specific tasks.

```java
static void greet() {
    System.out.println("Welcome to Java");
}
```

---

## 🔹 Method Based on Return Type

### ▶ Method With Return Value

```java
static int square(int x) {
    return x * x;
}
```

### ▶ Method Without Return Value (void)

```java
static void showMessage() {
    System.out.println("No return value");
}
```

---

## 🔹 Method Based on Parameters

### ▶ Method With Parameters

```java
static int sum(int a, int b) {
    return a + b;
}
```

### ▶ Method Without Parameters

```java
static void display() {
    System.out.println("No parameters");
}
```

---

## 🔹 Static vs Non-Static Methods

### ▶ Static Method

* Belongs to class
* Called using class name

```java
static void info() {
    System.out.println("Static method");
}
```

### ▶ Non-Static Method

* Belongs to object
* Called using object reference

```java
void show() {
    System.out.println("Non-static method");
}
```

---

## 🔹 Method Overloading

Defining multiple methods with **same name but different parameters**.

```java
static int add(int a, int b) {
    return a + b;
}

static double add(double a, double b) {
    return a + b;
}
```

✔ Achieved using:

* Different number of parameters
* Different data types

---

## 🔹 Method Overriding

When a subclass provides its own implementation of a method already defined in the parent class.

```java
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class");
    }
}
```

---

## 🔹 Access Modifiers in Methods 🔐

| Modifier  | Accessibility            |
| --------- | ------------------------ |
| public    | Everywhere               |
| protected | Same package or subclass |
| default   | Same package             |
| private   | Within class only        |

---

## 🔹 Recursive Methods

A method that calls itself.

```java
static int factorial(int n) {
    if (n == 0)
        return 1;
    return n * factorial(n - 1);
}
```

---

## 🔹 Important Points 📝

* Method name should be meaningful
* Follow camelCase naming convention
* Use `return` only when return type is not void
* A program starts execution from `main()` method

```java
public static void main(String[] args) {
    // program execution starts here
}
```

---

## 🎯 Conclusion

Methods are the backbone of Java programming. Understanding how to define and use methods efficiently helps in writing **clean, reusable, and professional Java code**.

---
