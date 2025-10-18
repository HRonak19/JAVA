// print the revers number 

    //befor
    // user  123
    //after
    // computer 321

import java.util.Scanner;

class Revers {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Ente Any Number : ");
            int n = sc.nextInt();

            int rev=0,r;

                while(n > 0) {

                    r = n % 10;
                    System.out.print(r);
                    n = n / 10;
                }
    }
}