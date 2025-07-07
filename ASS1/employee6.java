/*
Write a java program to read employee information such as no, name, basic salary, 
HRA, DA from the keyboard and display it on the screen. 
*/
import java.util.*;

class employee6 {

    int no;
    String name;
    int basic_salary;
    int hra;
    int da;

        void getdata() {
            
            Scanner  Scan = new Scanner(System.in);

                System.out.print("Enter employee NO : ");
                no = Scan.nextInt();

                System.out.print("Enter employee Name : ");
                name = Scan.next();

                System.out.print("Add Basic Salary : ");
                basic_salary = Scan.nextInt();

                System.out.print("Add HRA : ");
                hra = Scan.nextInt();

                System.out.print("Add DA : ");
                da = Scan.nextInt();
        }

    void display() {

        System.out.println();

            System.out.println("\t employee Details\n");
            System.out.println("Employee Name : "+name);
            System.out.println("Basic Salary : "+basic_salary);
            System.out.println("HRA : "+hra);
            System.out.println("DA : "+da);

    }
    
    public static void main(String[] args) {

        employee6 emp = new  employee6();

            emp.getdata();
            emp.display();
    }
}