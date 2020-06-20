/*PROBLEM 17) Triangle - Left Justified
Draw right angled triangle of given height
Sample input:
4
Sample output
*
**
***
****
*/

import java.util.Scanner;

public class Problem17{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){   
            for (int cc=1; cc<=rc; cc++){
                System.out.print("*");
            }
            System.out.println();  
        }
    }
}