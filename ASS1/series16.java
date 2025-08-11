import java.util.*;
class series16 {

    public static void main (String[] args) {

        Scanner Scan = new Scanner(System.in);

            System.out.print("Enter Any number : ");
            int n = Scan.nextInt();

        int update=0,i;
        
        for(i=1; i<=n; i++) {

            update=0;

                for(int j=1; j<=i; j++) {

                        if(i % j == 0) {
                            update++;
                        }
                }
        

            int tamp=0 , lastpoint=0;

            if (update==2 || i == 1) {

                     lastpoint =  tamp + i;

                        System.out.print(" "+lastpoint);
                    tamp = lastpoint;
            }
        }
    }
} 