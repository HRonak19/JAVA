// Calculate simple interest using command line

class simpleinterest {
    
    public static void main (String args[]) {

        int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);

        int s = (p*r*n) / 100;

            System.out.print("simple intereset : "+s);
    }
}