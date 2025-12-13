import java.util.Scanner;

interface addsub {

    void addition(int a, int b);
    void subtaction(int a,int b);
}
interface muldiv extends addsub {

    void multipalication(int a,int b);
    void division(int a,int b);
}

class form implements muldiv {

    public void addition(int a, int b) {
        System.out.println(a+b);
    }
    public void subtaction(int a,int b) {
        System.out.println(a-b);
    }
    public void multipalication(int a,int b) {
        System.out.println(a*b);
    }
    public void division(int a,int b) {
        System.out.println(a/b);
    }
}

class inter {

    public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);

                System.out.print("Enter First One :");
                int one = sc.nextInt();
                System.out.print("Enter Second One : ");
                int two = sc.nextInt();

            form f = new form();

                f.addition(one,two);
                f.subtaction(one,two);
                f.multipalication(one,two);
                f.division(one,two);
            
    }
}