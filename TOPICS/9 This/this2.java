// this: to invoke current class method:

class this2 {

    public static void main (String args[]) {

        hello h = new hello();

        h.two();

    }
}

class hello {


    void one () {

        System.out.println("hello");
    }

    void two () {

        this.one();
        System.out.print("hello hello ");
    }
}