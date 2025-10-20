# **🔁 continue — Skip current iteration**

* Skips the rest of the current loop iteration.
* Jumps to the next iteration.

## **🧱 Syntax:**
```
for (...) {
    if (condition) {
        continue;
    }
    // code that will be skipped if condition is true
}
```

# **🖨️ Output:**
```
i = 1  
i = 2  
i = 3  
i = 4  
i = 6  
i = 7
```
> Notice: `i = 5` is `skipped!`