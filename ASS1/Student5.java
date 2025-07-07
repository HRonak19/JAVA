/*
Create a class student with rno, sname and city as class member and get the detail 
form the user and display it on the screen.
*/
import java.util.Scanner;

class Student5 {

    int Rno;
    String Sname;
    String city;

        void getdata() {

            Scanner Scan = new Scanner(System.in);

                System.out.print("Enter Student RollNumber : ");
                Rno = Scan.nextInt();

                System.out.print("Enter Student Name : ");
                Sname = Scan.next();

                System.out.print("Enter City : ");
                city = Scan.next();

        }

    void display() {
        
        System.out.println("Student RollNumber : "+Rno);
        System.out.println("Student Name : "+Sname);
        System.out.println("city :"+city);
    }

    public static void main (String[] args) {

        Student5 stu = new Student5();

        stu.getdata();
        stu.display();
    }



}