import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Greet");
        System.out.println("2. Show Date");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello! Have a great day!");
                break;

            case 2:
                System.out.println("Today's date is: 26 May 2025");
                break;

            case 3:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
