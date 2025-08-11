
class Student {

    int rno;
    String name;

        Student(int r,String n) {

            rno = r;
            name = n;
        }

        void display () {

            System.out.println(rno+" "+name);
        }
}

class Parameterized {

    public static void main (String[] args) {

        Student ST = new Student(16,"Ronak");
        Student ST1 = new Student(17,"Rohan");
            ST.display();
            ST1.display();
    }
}