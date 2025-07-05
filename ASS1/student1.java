/*
 Write a program to write your full name, address, college address on the screen. 
*/

import java.util.Scanner;

class student1 {

	public static void main (String[] args) {

		Scanner Scan = new Scanner(System.in);

			System.out.print("Enter Full Name : ");
			String Name = Scan.nextLine();

			System.out.print("Enter College Name : ");
			String Cname = Scan.nextLine();

			System.out.print("Enter Address : ");
			String Ads = Scan.nextLine();

			System.out.print("Name "+Name+"\n"+"College Name : "+Cname+"\n"+"Address : "+Ads);
	}
}