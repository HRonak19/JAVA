// write a java code to print days name of week using switch

import java.util.Scanner;

class week {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Any Number to shoew its week : ");
            int weekno = sc.nextInt();

        switch(weekno) 
        {
            case 1 -> System.out.print("Sunday");
            case 2 -> System.out.print("Monday");
            case 3 -> System.out.print("Tuesday");
            case 4 -> System.out.print("Wednesday");
            case 5 -> System.out.print("Thursday");
            case 6 -> System.out.print("Friday");
            case 7 -> System.out.print("Saturday");
        }
    }
}