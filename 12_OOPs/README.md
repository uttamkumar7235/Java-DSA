# 📘 OOPs (Object-Oriented Programming) in Java

This README provides a **complete and beginner-friendly guide** to **Object-Oriented Programming System (OOPs) in Java**. It covers all core concepts with definitions, examples, and interview-oriented explanations.

---

## 🔰 What is OOPs?

**OOPs (Object-Oriented Programming System)** is a programming paradigm based on the concept of **objects**, which contain **data (variables)** and **behavior (methods)**.

Java is an **object-oriented language** that helps build **scalable, reusable, secure, and maintainable** applications.

---

## 🧱 Core Concepts of OOPs in Java

### 1️⃣ Class

A **class** is a blueprint or template used to create objects.

```java
class Student {
    String name;
    int age;

    void study() {
        System.out.println("Student is studying");
    }
}
```

---

### 2️⃣ Object

An **object** is an instance of a class.

```java
Student s1 = new Student();
s1.name = "Amit";
s1.study();
```

---

### 3️⃣ Encapsulation

Encapsulation means **binding data and methods together** and **hiding data** using access modifiers.

```java
class Account {
    private int balance;

    public void setBalance(int b) {
        balance = b;
    }

    public int getBalance() {
        return balance;
    }
}
```

✅ Achieved using `private`, `public`, getters & setters

---

### 4️⃣ Inheritance

Inheritance allows one class to **acquire properties and methods** of another class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

✅ Promotes **code reuse**

---

### 5️⃣ Polymorphism

Polymorphism means **one method, many forms**.

#### a) Compile-Time Polymorphism (Method Overloading)

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

#### b) Runtime Polymorphism (Method Overriding)

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
```

---

### 6️⃣ Abstraction

Abstraction hides **implementation details** and shows only **essential features**.

#### Abstract Class

```java
abstract class Shape {
    abstract void draw();
}
```

#### Interface

```java
interface Vehicle {
    void run();
}
```

---

## 🔗 Interface (Detailed)

* Methods are `public` and `abstract` by default
* Variables are `public static final`
* Supports **multiple inheritance**

```java
interface Flyable {
    void fly();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Bird is flying");
    }
}
```

---

## 🔓 Loose Coupling

Loose coupling means **depending on abstraction (interface)** instead of concrete classes.

```java
interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol engine started");
    }
}

class Car {
    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }
}
```

---

## 🧠 OOPs Concepts Summary

| Concept       | Purpose           |
| ------------- | ----------------- |
| Class         | Blueprint         |
| Object        | Instance of class |
| Encapsulation | Data hiding       |
| Inheritance   | Code reuse        |
| Polymorphism  | Flexibility       |
| Abstraction   | Hide complexity   |

---
