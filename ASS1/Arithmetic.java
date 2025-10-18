// Q2 take two numbers and perform arithmetic 

import java.util.Scanner;

class Arithmetic {

    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter First Number : ");
            int N1 = sc.nextInt();
            
            System.out.print("Enter Second Number : ");
            int N2 = sc.nextInt();

            System.out.println("Sum : "+ (N1+N2));
            System.out.println("Sub : "+ (N1-N2));
            System.out.println("Multi : "+ (N1*N2));
            System.out.print("Divi : "+ (N1/N2));
    }
} 