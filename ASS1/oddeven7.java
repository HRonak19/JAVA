/*
    Write a java program that will check whether enter number is odd or even. 
*/
import java.util.*;

class oddeven7 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.print("Enter Any One Number to Check odd or even : ");
            int num = Scan.nextInt();

                if(num % 2 == 0) {
                    System.out.print(num +" is even Number");
                }
                else {
                    System.out.print(num +" is odd Number");
                }
    }
}