// Q4 calculate simple interest

import java.util.Scanner;

class interest {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in); 

            System.out.print("Enter Price : ");
            int RP = sc.nextInt();

            System.out.print("Enter Precentage : ");
            int PR = sc.nextInt();

            System.out.print("Enter YEAR : ");
            int Y = sc.nextInt();

            int last_values = (RP*PR*Y) / 100;

            System.out.print("Simple Interest : "+last_values);
    }
}