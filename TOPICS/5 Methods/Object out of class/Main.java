import java.util.Scanner;

class Main {
	
	public static void main (String[] args) {

		arithmetic arith = new arithmetic();

		Scanner Scan = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int F = Scan.nextInt();
		System.out.print("Enter Second Number : ");
		int S = Scan.nextInt();

		arith.sum(F,S);
		arith.sub(F,S);
		arith.mult(F,S);
		arith.div(F,S);

	}
}