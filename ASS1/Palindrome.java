// check number is palindrome or no

    // Palindrome NO : 11  101  202 

import java.util.Scanner;

class Palindrome {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Any Number : ");
            int NO = sc.nextInt();

            int tp = NO;
            int rev=0,r;
                while(NO > 0) {
                    
                    r = NO % 10;
                    rev = (rev * 10) + r;
                    NO = NO / 10;
                }

            if(rev == tp) {
                System.out.print(rev +" is Palindrome ");
            }
            else {
                System.out.print(rev +" is not Palindrome ");
            }
    }
}