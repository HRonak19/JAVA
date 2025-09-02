// this() : to invoke current class constructor:

class Student {

    int Roll;
    String name;
    int fee;

        Student(int Roll , String name , int fee) {

            this.Roll = Roll;
            this.name = name;
            this.fee = fee;
        }

        void display() {
            System.out.println(Roll+" "+name+" "+fee);
        }
}

class this3 {

    public static void main (String args[]) {

            Student S1 = new Student(1,"Ronak",1000);
            Student S2 = new Student(2,"Rohit",1000);

            S1.display();
            S2.display();
    }
}