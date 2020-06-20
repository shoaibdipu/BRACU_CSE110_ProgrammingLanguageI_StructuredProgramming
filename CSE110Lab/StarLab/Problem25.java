/*PROBLEM 25) Hollow  Rhombus using solution of PROBLEM 20) Rhombus 
Just draw the image of the above triangle once. And then, the opposite, once.
Sample input:
3
Sample output
  *
 * *
*   *
 * *
  *
  
  */

import java.util.Scanner;

public class Problem25{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int spc=1; spc<=row-rc; spc++){
                System.out.print(" ");
            }
            
            if (rc==1){
                System.out.print("*");
            }else{
                System.out.print("*");
                for (int cc=1; cc<=2*rc-3; cc++){ 
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int rc=1; rc<=row-1; rc++){
            for (int spc=1; spc<=rc; spc++){
                System.out.print(" ");
            }
            if (rc==row-1){
                System.out.print("*");
            }else{
                System.out.print("*");
                for (int cc=1; cc<=2*(row-rc)-3; cc++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}