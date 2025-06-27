# **METHOD**

In Java programming, a method is a block of code that performs a specific task. You can think of it as a function in other programming languages like Python or C.

---

## 🔹 Why Use Methods?
- Code reusability: Write once, use multiple times.
- Modular design: Break complex problems into smaller pieces.
- Improves readability and maintainability.

---
## 🔸 Structure of a Method
```
returnType methodName(parameterList) {
    // method body
}
```
## 🔸 Example

```
public int add(int a, int b) {
    return a + b;
}
```

- `public` → access modifier (who can access it)
- `int` → return type (this method returns an integer)
- `add` → method name
- `(int a, int b)` → parameters
- `return a + b;` → body (what the method does)
---
# **🔹 How to Call a Method**
You call a method using the method name and provide the required arguments:
```
int result = add(5, 3);  // result will be 8
```
If the method is not static, it must be called using an object:
```
MyClass obj = new MyClass();
int result = obj.add(5, 3);
```
---

# 🔸 Example with main Method
```
public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.multiply(4, 5);
        System.out.println("Result: " + result);
    }
}
```
# 🔹 Types of Methods in Java
1 Predefined Methods `(like System.out.println())`

2 User-defined Methods (ones you create)

Let me know if you want an example with `static` methods, `void` methods, or method overloading!