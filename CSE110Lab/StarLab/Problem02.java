/* PROBLEM 2) Rectangle 
 Sample input:
 4
 6
 Sample output
 123456
 123456
 123456
 123456*/

import java.util.Scanner;

public class Problem02{
    public static void main (String[]args){
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter row number");
        int row=sc.nextInt();
        
        System.out.println("Enter column number");
        int column=sc.nextInt();
        
        for (int rc=1; rc<=row; rc++){
            for (int cc=1; cc<=column; cc++){
                System.out.print(cc);
            }
            System.out.println();
        }
    }
}