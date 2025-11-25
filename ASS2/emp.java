/*

    class emp  take user input 
    class data its datamemeber sal,name,age  access by using Cunstructur with THIS keyword
    create display method on class data and display all stuffs 

*/

import java.util.Scanner;

class data {

    String name;
    int sal;
    int age;

    data(String name , int sal , int age) {
        this.name=name;
        this.sal=sal;
        this.age=age;
    }

    void display() {

        System.out.println("NAME : "+name);
        System.out.println("SAL : "+sal);
        System.out.print("AGE : "+age);
    }
}

class emp {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter emp name : ");
            String name = sc.next();

            System.out.print("Enter emp sal : ");
            int sal = sc.nextInt();

            System.out.print("Enter emp age : ");
            int age = sc.nextInt();

        data D = new data(name,sal,age);

        D.display();
    }

}