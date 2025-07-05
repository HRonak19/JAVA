/*
Write a java program to enter any string and display it on the screen.
*/
import java.util.Scanner;

class str3 {

	public static void main (String[] args) {

		Scanner Scan = new Scanner(System.in);

		System.out.print("Enter Any String : ");
		String Str = Scan.nextLine();


		System.out.println(Str);
	}
}