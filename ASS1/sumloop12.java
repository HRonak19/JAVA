/*
. Write a program to find out sum of 10 no. using any loop.
*/
import java.util.*;

class sumloop12 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.print("Ente any Number : ");
            int Num = Scan.nextInt();

            int total =0;

            for(int i=1; i<=Num; i++){
                total = total + i;
            }
            System.out.print("Sum is : "total);
    }
}