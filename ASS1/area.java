// area of circle using commandling 

class area {

    public static void main(String args[]) {

            double ar  = 0 , r;

            r = Integer.parseInt(args[0]); // command line 

            ar  = 3.14 * r * r;

            System.out.print("area of circle : "+ar);
    }
}