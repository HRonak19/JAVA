/*
    class name is shopping
    class shopping datamember have Item_code , Item_name , Item_Price
    Enter data and Access data using object 
    sum of the price
*/

import java.util.Scanner;

class Shopping {

    int Item_code;
    int Item_price;
    String Item_name;

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

            Shopping sp0 = new Shopping();
            Shopping sp1 = new Shopping();

                System.out.print("Item code 0 :");
                sp0.Item_code = sc.nextInt();
                System.out.print("Item code 1 :");
                sp1.Item_code = sc.nextInt();

                System.out.print("Item Name 0 :");
                sp0.Item_name = sc.next();
                System.out.print("Item Name 1 :");
                sp1.Item_name = sc.next();

                System.out.print("Item Price 0 :");
                sp0.Item_price = sc.nextInt();
                System.out.print("Item Price 1 :");
                sp1.Item_price = sc.nextInt();

                System.out.print("here is the total price : "+(sp0.Item_price +sp1.Item_price)); 

                
    }
} 