// Sum of 1 to 10 number using loop;
// array

import java.util.Scanner;

class SumTeen {

    public static void main (String args[]) {

        // first method 
        int[] a;
        a = new int[1];

       // Second method
        int arr[] = new  int[10];

            int sum=0;
        
        Scanner sc = new Scanner(System.in);

            for(int i = 0; i<=9; i++) {

                System.out.print("a["+i+"]=");
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i <= 9; i++) {

                sum = sum + arr[i];
        
                    if(i==9) {
                         System.out.print(" = ");
                        System.out.print(sum);
                    }
                    else {
                        System.out.print(sum+" ");      
                    }
            }
    }
}