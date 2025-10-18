// Q9 Armstrong or Not

    // 152
import java.util.Scanner;

class Armstrong {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Any Number : ");
            int N = sc.nextInt();

                int R , REV = 0, TAMP=N;

            while (N>0) {

                R = N % 10;
                REV = REV + (R*R*R);
                N = N / 10;
            }

            if(REV == TAMP) {
                System.out.print(TAMP +" Is Armstrong");
            }
            else {
                System.out.print(TAMP +" Is NOT Armstrong");
            }

            
    }
}