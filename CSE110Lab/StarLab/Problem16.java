/*PROBLEM 16) Rectangle using solution of PROBLEM 15) Star Line
Sample input:
4
6
Sample output
******
******
******
******

*/

import java.util.Scanner;

public class Problem16{
        public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        System.out.println("Enter column number");
        int column=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int cc=1; cc<=column; cc++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}