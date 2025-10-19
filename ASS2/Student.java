// check Student as Per Following

/*

    Per < 35  Fail
    Per < 50 PASS
    Per < 60 Second 
    Per > 70 Distinction
*/

import java.util.Scanner;

class Student {
    
    float per;

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            Student S = new Student();

                System.out.print("Enter Any Number : ");
                S.per = sc.nextFloat();

                    if(S.per >= 70) {
                        System.out.print("DISTINCTION");
                    }
                    else if(S.per >= 60 && S.per < 70) {
                        System.out.print("First Class ");
                    }
                    else if(S.per >= 50 && S.per < 60){
                        System.out.print("Second Class");
                    }
                    else if(S.per >= 35 && S.per < 50){
                        System.out.print("PASS");
                    }
                    else {
                        System.out.print("FAIL");
                    }
        }
}