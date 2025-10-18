// find Fectorial 1 to n number;

    // 5
    // 1 2 6 24 125
import java.util.Scanner;

class Fectorial {

    public static void main (String args[]) {
    
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Any number : ");
            int n = sc.nextInt();

            int fact=1;

            for(int i = 1; i<=n; i++) {

                fact = fact * i;

                System.out.print(fact +" ") ;   
            }        
    }
}