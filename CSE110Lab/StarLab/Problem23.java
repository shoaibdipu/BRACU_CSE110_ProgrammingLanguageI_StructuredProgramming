/*PROBLEM 23) Hollow Triangle - Right Justified using solution of PROBLEM 18) Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
    *
   **
  * *
 *  *
*****

*/

import java.util.Scanner;

public class Problem23{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int spc=1; spc<=row-rc; spc++){
                System.out.print(" ");
            }
            if (rc==1 || rc==2 || rc==row){ 
                for (int cc=1; cc<=rc; cc++){
                    System.out.print("*");
                }
            }else{
                for (int cc=1; cc<=rc; cc++){
                    if (cc==1 || cc==rc){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}