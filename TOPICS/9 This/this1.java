// this: to refer current class instance variable:

class this1 {

    public static void main (String args[]) {

        student st = new student(1,"har",1000);
        student st1 = new student(2,"jam",2000);

            st.display();
            st1.display();

    }
}

class student {

    int rollno ;
    String name;
    int fee;

        student(int r,String n,int f) {

            this.rollno = r;
            this.name = n;
            this.fee = f;
        }

    void display() {

        System.out.println(rollno+" "+name+" "+fee);
    }
}