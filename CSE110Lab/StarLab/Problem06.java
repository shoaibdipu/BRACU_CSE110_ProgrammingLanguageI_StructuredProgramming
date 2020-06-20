/*PROBLEM 6) Triangle - Isosceles
Draw triangle of given height
Sample input 1:
3
Sample output 1:
  1
 123
12345
*/

import java.util.Scanner;

public class Problem06{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int spc=1; spc<=row-rc; spc++){
                System.out.print(" ");
            }
            for (int cc=1; cc<=2*rc-1; cc++){
                System.out.print(cc);
            }
            System.out.println();
        }
    }
}