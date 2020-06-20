/*PROBLEM 12) Hollow  Rhombus 
Just draw the image of the above triangle once. And then, the opposite, once.
Sample input:
3
Sample output
  1
 1 3
1   5
 1 3
  1    
  
*/

import java.util.Scanner;

public class Problem12{
    
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int spc=1; spc<=row-rc; spc++){
                System.out.print(" ");
            }
            for (int cc=1; cc<=2*rc-1; cc++){
                if (cc==1 || cc==2*rc-1){
                    System.out.print(cc);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        for (int rc=1; rc<=row-1; rc++){
            for (int spc=1; spc<=rc; spc++){
                System.out.print(" ");
            }
            for (int cc=1; cc<=2*(row-rc)-1; cc++){
                if (cc==1 || cc==2*(row-rc)-1){
                    System.out.print(cc);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}