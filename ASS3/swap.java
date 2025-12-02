/*
    class swap  
    {
        getdata();
        swap();
    }
*/
import java.util.Scanner;

class swap {

    int a,b;

        void getdata() {

            Scanner sc = new Scanner(System.in);

                System.out.print("Enter First Number for A : ");
                a = sc.nextInt();
                System.out.print("Enter Second Number For B : ");
                b = sc.nextInt();
        }

        void swap() {

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("A = "+a);
            System.out.print("B = "+b);
        }

        public static void main(String args[]) {

            swap sw = new swap();

                sw.getdata();
                sw.swap();
        }
}