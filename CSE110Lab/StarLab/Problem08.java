/*PROBLEM 8) Hollow Rectangle
Display a rectangle of given length and width. 
Sample input:
4
5
Sample output
12345
1   5
1   5
12345 */

import java.util.Scanner;

public class Problem08{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        System.out.println("Enter column number");
        int column=sc.nextInt();
        
        int rc,cc;
        
        for (rc=1; rc<=row; rc++){
            if (rc==1 || rc==row){
                for (cc=1; cc<=column; cc++){
                    System.out.print(cc);
                }
            }else{
                System.out.print("1");
                for (cc=1; cc<=column-2; cc++){
                    System.out.print(" ");
                }
                System.out.print(cc+1);
            }
            System.out.println();
        }
    }
}