/*
    Write a java program to calculate the simple interest. 

    Amount * interest * Years / 100; 
*/
import java.util.*;

class interest4 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Amount : ");
        int A = Scan.nextInt();

        System.out.print("Enter Interest % : ");
        int I = Scan.nextInt();

        System.out.print("Years : ");
        int Y = Scan.nextInt();

            int total = A * I * Y / 100;

            System.out.print(total);
    }
}