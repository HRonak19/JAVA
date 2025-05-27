import java.util.Scanner;

class Main {

    public static void main (String args[]) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Any Number : ");
        int Num = Scan.nextInt();

        while(0<Num){
            System.out.println(Num);
        Num--;
        
        }
    }
}