/*
Write a program to find maximum numbers from entered 3 numbers. 
*/
import java.util.*;

class max8 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.print("Enter First Number : ");
            int num1 = Scan.nextInt();

            System.out.print("Enter Second Number : ");
            int num2 = Scan.nextInt();

            System.out.print("Enter Last Number : ");
            int num3 = Scan.nextInt();

                if(num1>num2 && num1>num3) {
                    System.out.print("First Number is Max");
                }
                else if(num2>num1 && num2>num3) {
                    System.out.print("Second Number is Max");
                }
                else {
                    System.out.print("Last Number is Max");
                }
    }
}