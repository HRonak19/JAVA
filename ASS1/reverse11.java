
// Write a java program to print reverse number enter by the user. 

import java.util.Scanner;

class reverse11 {

    public static void main (String[] args ){

        Scanner  Scan = new Scanner(System.in);

            System.out.print("Enter number to reverse it : ");
            int num = Scan.nextInt();

                int r,rev=0;

                    while(num>0) {
                        r = num % 10;
                        rev = rev*10 + r;
                        num = num / 10;
                    }

                    System.out.print("here is reverse number : "+rev);
    }
}