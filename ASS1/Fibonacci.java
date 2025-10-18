//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

import java.util.Scanner;

class Fibonacci {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Any Number : ");
            int n = sc.nextInt();

            int a=0,b=1,c=0;

            for(int i=1; i<=n; i++) {

                System.out.print(" "+a);

                c = a+b;
                a = b;
                b = c;
            }

    }
}