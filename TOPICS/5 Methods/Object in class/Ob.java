import java.io.*;

class Ob {

    public static void main (String[] args) {

        Ob O = new Ob();

        int total =O.add(2,2);

        System.out.print("total is : "+total);
    }

    public int add(int a,int b) {

        return a+b;
    }
}