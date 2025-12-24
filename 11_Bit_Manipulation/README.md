# 11 🔢 Bit Manipulation in Java

Bit Manipulation is a technique that uses **binary representation (0s and 1s)** of numbers to solve problems efficiently.  
It is widely used in **DSA, competitive programming, and interviews**.

---

## 🧠 Why Bit Manipulation?
- ⚡ Faster than arithmetic operations
- 💾 Memory efficient
- 🧩 Useful for tricky DSA problems
- 🚀 Improves problem-solving skills

---

## 🔧 Bitwise Operators in Java

| Operator | Name | Description |
|--------|------|-------------|
| `&` | AND | 1 if both bits are 1 |
| `\|` | OR | 1 if any bit is 1 |
| `^` | XOR | 1 if bits are different |
| `~` | NOT | Inverts bits |
| `<<` | Left Shift | Multiply by 2 |
| `>>` | Right Shift | Divide by 2 |
| `>>>` | Unsigned Right Shift | Zero-fill shift |

---

## 📌 Basic Examples

```java
int a = 5;   // 0101
int b = 3;   // 0011

System.out.println(a & b); // 1
System.out.println(a | b); // 7
System.out.println(a ^ b); // 6
System.out.println(~a);    // -6
System.out.println(5 << 1);  // 10
System.out.println(10 >> 1); // 5
```

---

## 🧩 Important Bit Tricks

### ✅ Check Even or Odd
```java
if ((n & 1) == 0)
    System.out.println("Even");
else
    System.out.println("Odd");
```

### 🔢 Get ith Bit
```java
int bit = (n >> i) & 1;
```

### 🟢 Set ith Bit
```java
n = n | (1 << i);
```

### 🔴 Clear ith Bit
```java
n = n & ~(1 << i);
```

### 🔄 Toggle ith Bit
```java
n = n ^ (1 << i);
```

### ❓ Check Power of Two
```java
boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);
```

### 🔢 Count Set Bits (Brian Kernighan’s Algorithm)
```java
int count = 0;
while (n > 0) {
    n = n & (n - 1);
    count++;
}
```

### 🔄 Swap Two Numbers (No Temp Variable)
```java
a = a ^ b;
b = a ^ b;
a = a ^ b;
```

---

## 🚀 Author

### Uttam Kumar
🎓 DSA | Java | Problem Solving

⭐ If you find this repository helpful, consider **starring it on GitHub!**
