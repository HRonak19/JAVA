// Q8 Maximum values form 3 numbers

import java.util.Scanner;

class Maximum {

    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("enter First Number : ");
            int N1 = sc.nextInt();

            System.out.print("Enter Second Number : ");
            int N2 = sc.nextInt();

            System.out.print("Enter Last Number : ");
            int N3 = sc.nextInt();

                if(N1 > N2 && N1 > N3) {
                    System.out.print("the value of N1 : "+N1 +" is BIG");
                }
                else if(N2 > N1 && N2 > N3) {
                    System.out.print("The value of N2 : "+ N2 +" is BIG");
                }
                else {
                    System.out.print("The value of N3 : "+ N3 +" is BIG");
                }
    }
}