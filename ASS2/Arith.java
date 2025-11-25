// Perform additon , Subtrection , Multipalication , Division By using command line argument

/*

    complection Process
    
        javac  codename.java 
        java codename First_value Second_Value

*/
import java.util.*;

class Arith {

    public static void main (String args[]) {

        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);

        System.out.println("Sum = "+ (A+B));
        System.out.println("Sub = "+ (A-B));
        System.out.println("Mul = "+ (A*B));
        System.out.print("Div = "+ (A/B));
       
    }
}