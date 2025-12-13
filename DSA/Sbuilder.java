// String Builder class 

import java.util.*;

class Sbuilder {

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Ronak");

            System.out.println(sb);

            // char at index 0
            System.out.println(sb.charAt(0));

            //set char at index 0
            sb.setCharAt(0,'A');
            System.out.println(sb);

            // insert char at index 0
            sb.insert(0,'S');
            System.out.println(sb);

            // delete char at index 0 to 2
            sb.delete(0,2);
            System.out.println(sb);

            // insert char into last 
            sb.append('P');
            System.out.println(sb);
    }
}