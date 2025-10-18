// Q1 take NAME , ADDRESS and COLLEGE address from USER and DISPLAY it 

import java.util.Scanner;

class Display {

    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your FullName : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Address : ");
        String address = sc.nextLine();

        System.out.print("Enter College Address : ");
        String Caddress = sc.nextLine();

            System.out.print("Name : "+name +"\nAddress : "+address +"\nCollege Address : "+Caddress);

    }
}
