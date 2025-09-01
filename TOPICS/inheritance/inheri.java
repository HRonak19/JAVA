import java.util.*;

class inheri {

    public static void main (String args[]) {

        cba b = new cba();
        b.display();
    }

}
class abc {

    int a = 10;
}
class cba extends abc {

    int b = 20 ;

        void display() {

            System.out.println(a+" "+b);
        }
}