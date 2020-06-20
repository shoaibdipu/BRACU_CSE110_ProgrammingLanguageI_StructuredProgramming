/*PROBLEM 9) Hollow Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
5
Sample output
1
12
1 3
1  4
12345 */

import java.util.Scanner;
public class Problem09{
    
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            if (rc==1 || rc==2 || rc==row){ 
                for (int cc=1; cc<=rc; cc++){ 
                    System.out.print(cc);
                }
            }else{
                for (int cc=1; cc<=rc; cc++){
                    if (cc==1 || cc==rc){
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