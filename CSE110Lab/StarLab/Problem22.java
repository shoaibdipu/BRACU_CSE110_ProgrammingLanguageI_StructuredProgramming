/*PROBLEM 22) Hollow Triangle - Left Justified using solution of PROBLEM 17) Triangle - Left Justified
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

public class Problem22{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
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