# **Switch**
> A `switch` statement lets you test a variable against many possible values, and run different code based on which value it matches.

## **Syntex**
```
switch (expression) {
    case value1:
        // Code block for value1
        break;
    case value2:
        // Code block for value2
        break;
    ...
    default:
        // Code if no case matches
}
```
## **🔑 Key Points:**

* The `expression` can be `int`, `char`, `String`, etc.
* `break`; ends the case block (optional, but usually needed to avoid fall-through)
* `default`: runs if no case matches.

# **🖨️ Sample Output:**
```
Choose an option:
1. Greet
2. Show Date
3. Exit
Enter your choice: 1
Hello! Have a great day!
```