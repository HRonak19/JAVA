import java.util.Scanner; //add Scanner method

class Main {

    public static void main (String args[]) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter Your age : ");
        int age = Scan.nextInt();

        if (age<18) {

            System.out.print("minor !");
        }
        else if(age>=18 && age<=50) {
            
            System.out.print("adult !");
        }
        else if(age>=50 && age<=100) {
            
            System.out.print("old");
        }
        else {
            
            System.out.print("Invalid !");
        }

    Scan.close();
    }
}
