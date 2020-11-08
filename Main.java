package sample;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of row in an array: ");
        int row = sc.nextInt();
        System.out.print("Enter the value of column in an array: ");
        int col = sc.nextInt();
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the address value for c: ");
        int c = sc.nextInt();
        System.out.print("Enter the address value for d: ");
        int d = sc.nextInt();
        System.out.print("What certain data type will be use?\n type 1  for integer and  2 for double ");
        int esize = sc.nextInt();

        int dtype_int = 4;
        int k = base + ((row * c) + col) * dtype_int;
        int s = base + (row + (col * d)) * dtype_int;

        int dtype_double = 8;
        int a = base + ((row * c) + col) * dtype_double;
       int  j = base + (row + (col * d)) * dtype_double;


            if (esize==1) {
                System.out.print("Value of x for row wise:" + k);
                System.out.print("\nValue of x for column wise:" + s);
            }
            else if (esize==2) {
                System.out.print("Value of x for row wise:" + a);
                System.out.print("\nValue of x for column wise:" + j);
            }
            else {

                    System.out.print("Enter the correct value for data type, input either 1 or 2 only ");

            }

        
    }
}
