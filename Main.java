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
            if (esize == 1)
            { int dtype = 4;
                int x[][]= new int [row][col];
                x[row][col]=base+((row*c)+col)*esize;
                System.out.print("Value of x for row wise:"+x);
            }
            else if (esize==2)
            { int dtype = 8; }
            else { System.out.print("Enter the correct value for data type, input either 1 or 2 only "); }

            //int x[][]= new int [row][col];
        
    }
}
