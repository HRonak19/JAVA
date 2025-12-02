/*
wjp of cunstructor overloading which is used parameter 
cunstructor use id , name and city as a data memeber
*/
import java.util.Scanner;

class cst_over {

    int id;
    String name , city;

    cst_over(int oneP,String SecondP,String lastP) {

        id = oneP;
        name = SecondP;
        city = lastP;
    }
    cst_over(int oneP,String SecondP) {

        id = oneP;
        name = SecondP;
        city = "botad";

    }

    void disdata() {

        System.out.println("ID : "+id);
        System.out.println("name : "+name);
        System.out.print("city : "+city);
    }

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("enter id :");
            int id = sc.nextInt();
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("enter city : ");
            String city = sc.next();

            cst_over co = new cst_over(id,name,city);
            cst_over co0 = new cst_over(42,"jara");

        co.disdata();
        System.out.println("\n");
        co0.disdata();
    }
}