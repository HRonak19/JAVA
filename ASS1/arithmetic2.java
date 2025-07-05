/*
Write a java program to enter two number by the user and perform the addition, 
subtraction, multiplication and division.
*/
import java.util.Scanner;

class arithmetic2 {

	public static void main (String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int Number1 = Scan.nextInt();

		System.out.print("Enter Second Number : ");
		int Number2 = Scan.nextInt();


		System.out.println("Sum : "+(Number1+Number2)+"\n"+"Sub : "+(Number1-Number2)+"\n"+"Multi : "+(Number1*Number2)+"\n"+"Div : "+(Number1/Number2));
	}
}