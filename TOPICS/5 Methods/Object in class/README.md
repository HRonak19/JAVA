# **✅ What is Object in Java?**

- `Object` is the main (top-most) class in Java.
- Every class in Java automatically inherits from `Object`.
- So, every object you create is also an `Object`.

# 📦 Example:

```
class Animal {
    // This class automatically extends Object
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.toString());  // from Object class
    }
}
```

