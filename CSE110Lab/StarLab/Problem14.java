/*PROBLEM 14) Palindromic  Triangle
Sample input:
5
Sample output
    1
   121
  12321
 1234321
123454321 */

import java.util.Scanner;

public class Problem14{
    public static void main(String[]args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter row number");
       int row=sc.nextInt(); 
       
       for(int rc=1; rc<=row; rc++){
           for(int spc=1; spc<=row-rc; spc++){
               System.out.print(" ");
           }
           for(int i=1; i<=rc; i++){
               System.out.print(i);
           }
           for(int i=(rc-1); i>=1; i--){
               System.out.print(i);
           }
           System.out.println();
       }
    }
}
