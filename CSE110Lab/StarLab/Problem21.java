/*PROBLEM 21) Hollow Rectangle using solution of PROBLEM 16) Rectangle 
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
*****
*   *
*   *
*****
*/

import java.util.Scanner;

public class Problem21{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        System.out.println("Enter column number");
        int column=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            if (rc==1 || rc==row){
                for (int cc=1; cc<=column; cc++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for (int cc=1; cc<=column-2; cc++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}