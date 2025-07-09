//  Write a java program to find out factorial of given number. 

import java.util.*;


class factorial13 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner (System.in);

                System.out.print("Ente Any number : ");
                int num = Scan.nextInt();

            int total=1;

                for(int i=1; i<=num; i++) {

                    total = total * i;

                }
                System.out.print(total);
        
    }
}