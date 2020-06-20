/*PROBLEM 15) Star Line
Print as many stars as given in input
Sample input:
6
Sample output
****** 

*/

import java.util.Scanner;

public class Problem15{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter column number");
        int column=sc.nextInt();
        
        for (int cc=1; cc<=column; cc++){
            System.out.print("*");
        }
    }
}