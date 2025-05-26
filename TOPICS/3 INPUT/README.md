# **🔧User Input**

> In the java Programming to take input any thing From \
from user using Scanner Object

## **✅ Steps**
    1. import the `Scanner` class.
    2. Create a `Scanner` object.
    3. Use The object to read different types of input.

### 1. Step 
```
    // Import Scanner class in the top up to Main class
    import java.util.Scanner;
```

### 2. Step
```
    // Create Scanner object in the Main Method
    Scanner Scan = new Scanner(System.in);
```
### 3. Step
```
    // taking input from use in main method
    System.out.print("Enter Your Name : );
    String name = Scan.nextLine();
```
### 4. Step
```
    // print the use input !
    System.out.print(name);
```
### 5. Step
```
    // Close the scanner (best practice)
    Scan.close();
```

## **Input Methods**

|  Methods       |  Use  |
|:--------------:|:-----:|
|.nextLine();    |String |
|.nextInt();     |Integer|
|.nextDouble();  |Double |
|.nextBoolean(); |Boolean|




# **🖨️ OUTPUT**
```
Enter your name: Dejavu
Enter your age: 21
Enter your height in meters: 1.65
Are you a student? (true/false): true

--- User Details ---
Name: Dejavu
Age: 21
Height: 1.65 meters
Student: true
```