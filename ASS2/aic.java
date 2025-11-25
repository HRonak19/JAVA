//create access item class
import java.util.Scanner;
/*
class aic {

    int I_no , qty , rate;
    void getdata();
    void disdata();
} */



class aic {

    int I_no , qty , rate;

    int total;

    void getdata() {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter Item NO :");
            I_no = sc.nextInt();
            System.out.print("Enter QTY : ");
            qty = sc.nextInt();
            System.out.print("Enter Rate : ");
            rate = sc.nextInt();

            total = qty * rate ;
    }

    void disdata() {
        System.out.println("item no : "+I_no);
        System.out.println("qty : "+qty);
        System.out.println("rate : "+rate);
        System.out.print("total of sale : "+total);
    }

    public static void main (String args[]) {

        aic  ac = new aic();

            ac.getdata();
            ac.disdata();
    }
}