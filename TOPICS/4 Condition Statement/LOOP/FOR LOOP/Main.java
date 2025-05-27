import java.util.Scanner;

class Main {

    public static void main (String args[]) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("How Many Time's To Run : ");
        int Run = Scan.nextInt();

        for(int i=1; i<=Run; i++) {

            System.out.println(i);
        } 
    }
}