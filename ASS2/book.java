/*

    class book {
    
        int accno;
        String name;
        float price;

            void getdata();
            void disdata();
    }

*/
import java.util.Scanner;

class book {

    int accno;
    String name;
    float price;

        void getdata() {

                Scanner sc = new Scanner(System.in);

                    System.out.print("Enter account no : ");
                    accno = sc.nextInt();

                    System.out.print("Enter Name : ");
                    name = sc.next();

                    System.out.print("Enter Price : ");
                    price = sc.nextFloat();
        }

        void disdata() {

                System.out.println("\n --- Book INFO --- \n");
                System.out.println("Accout NO : "+accno);
                System.out.println("Name : "+name);
                System.out.print("Price : "+price);    
        }

        public static void main(String args[]) {

            book b = new book();

                b.getdata();
                b.disdata();
        }
}