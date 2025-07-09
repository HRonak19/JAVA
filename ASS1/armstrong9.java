/*
Write a program to check whether the given no. is Armstrong or not. 153
*/
import java.util.Scanner;

class armstrong9 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.print("enter Number to check Armstrong or not : ");
            int arm = Scan.nextInt();

                int r , rev=0 , tamp = arm;

                    while(arm>0) {
                        
                        r = arm % 10;
                        rev = (r*r*r) + rev;
                        arm = arm / 10 ;

                    }

                    System.out.print(rev);

                    if (tamp == rev ) {

                        System.out.print("its armstrong !");
                    }
                    else {
                        System.out.print("non armstrong number ");
                    }
    }
}