// Arithmetic using switch case

import java.util.Scanner;

class Arithmetic {

    int First , Second;

        public static void main(String args[]) {

                Scanner sc = new Scanner(System.in);
            int Selector;

            do  {
                System.out.print("\n\n1.addition \n2.Subtraction \n3.Miltiplication \n4.Divition \n select Any ONE : ");
                Selector = sc.nextInt();

                    if(Selector >= 5) {
                        System.out.print("\nSelect Right Number !");
                    }
            } while(Selector >= 5);

            Arithmetic A = new Arithmetic();

                System.out.print("Enter First Number : ");
                A.First = sc.nextInt();

                System.out.print("Enter Second Number : ");
                A.Second = sc.nextInt();

                switch(Selector) {

                    case 1 -> System.out.print(A.First+A.Second);
                    case 2 -> System.out.print(A.First-A.Second);
                    case 3 -> System.out.print(A.First*A.Second);
                    case 4 -> System.out.print(A.First/A.Second);
                }                    
        }
}