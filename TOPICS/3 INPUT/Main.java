import java.io.*; // to import all pakage 

import java.util.Scanner; // Step 1: Import Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in); // Step 2: Create Scanner object

        // Step 3: Taking different types of input
        System.out.print("Enter your name: ");
        String name = Scan.nextLine(); // String input

        System.out.print("Enter your age: ");
        int age = Scan.nextInt(); // Integer input

        System.out.print("Enter your height in meters: ");
        double height = Scan.nextDouble(); // Decimal input

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = Scan.nextBoolean(); // Boolean input

        // Output the data
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);

        Scan.close(); // Close the scanner (best practice)
    }
}
