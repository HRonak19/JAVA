 /*
 Write a program to check whether the given no. is palindrome or not.  121
 */
import java.util.*;

class palindrome10 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.print("Enter Number to check palindrom or not : ");
            int palin = Scan.nextInt();

            int r , rev=0,tamp= palin;

                while (palin>0) {

                    r = palin % 10;
                    rev = rev*10 + r;
                    palin = palin / 10;
                }

                System.out.print(rev);

                    if(tamp == rev) {
                        System.out.print(" it's palindrome number");
                    }
                    else {
                        System.out.print(" it Non palindrome number ");
                    }
    }
}