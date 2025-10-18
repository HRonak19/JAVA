// Q7 check number is odd or even

import java.util.Scanner;

class ODDEVEN {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("enter Any Number : ");
            int NO = sc.nextInt();

                if(NO % 2 == 0) {
                    System.out.print(NO +" IS EVEN");
                }
                else {
                    System.out.print(NO +"IS ODD");
                }
    }
}