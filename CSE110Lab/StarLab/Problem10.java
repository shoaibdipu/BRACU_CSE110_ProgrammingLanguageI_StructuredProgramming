/*PROBLEM 10) Hollow Triangle - Right Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
    5
   45
  3 5
 2  5
12345 */

import java.util.Scanner;

public class Problem10{
    
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int spc=1; spc<=row-rc; spc++){
                System.out.print(" ");
            }
            if (rc==1 || rc==2 || rc==row){
                for (int cc=(row-rc)+1; cc<=row; cc++){
                    System.out.print(cc);
                }
            }else{
                for (int cc=(row-rc)+1; cc<=row; cc++){
                    if (cc==(row-rc)+1 || cc==row){
                        System.out.print(cc);
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}