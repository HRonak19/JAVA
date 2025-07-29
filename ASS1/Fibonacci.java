import java.util.Scanner;

class Fibonacci {

    public static void main (String args[]) {

        Scanner Scan = new Scanner(System.in);

                System.out.print("Enter Any Number : ");
                int User = Scan.nextInt();

            int a=0,b=1,next;

                for(int i=1; i<=User; i++) {

                    System.out.print(a+" ");

                        next = a + b;
                        
                        a = b;

                        b = next;
                }        
    }
    
}