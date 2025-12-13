import java.util.Scanner;

abstract class abc {
    Scanner sc = new Scanner(System.in);
    abstract void d();
}
class ab extends abc{
    void d() {
       
        System.out.print("hello");
    }

    public static void main(String args[]){

        ab a = new ab();

        a.d();
    }
}